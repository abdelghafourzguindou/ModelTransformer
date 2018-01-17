package backend;
import com.google.inject.Injector;


import tmodel.Add;
import tmodel.Loader;
import tmodel.Delete;
import tmodel.LoadMetaModel;
import tmodel.LoadModel;
import tmodel.TmodelPackage;
import tmodel.Update;
import tmodel.grm.trm.TrmStandaloneSetup;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class Runner {
	
	static private Resource model;
	static private EObject modelRoot;
	static private ModelLoader loader = new ModelLoader();
	public Interpreter interpreter;
	
	
	public static void main(String[] args) {
		
		TmodelPackage.eINSTANCE.eClass();
		try {
			loademf("/home/zguindou/runtime-EclipseXtext/processProject/firsttest.trm");
			interpret();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param uri
	 * @throws Exception
	 */
	static public void loademf(String uri) throws Exception {
		URI emfURI = URI.createURI(uri.toString());
		Injector injector = new TrmStandaloneSetup().createInjectorAndDoEMFRegistration();
		Resource resource = null;
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		resource =  resourceSet.getResource(emfURI, true);
		EcoreUtil.resolveAll(resource);
		
		modelRoot = ((ResourceImpl) resource).getContents().get(0);
	}
	
	static public void interpret() {
		for(EObject object: modelRoot.eContents()) {	
			//System.out.println(object);
			if(object instanceof Loader) {
				Loader loadObject = (Loader) object;
				interpretLoad(loadObject);
			}
			else if(object instanceof Add) {
				Add addObject = (Add) object;
				interpretAdd(addObject);
			}
			else if(object instanceof Update) {
				Update updateObject = (Update) object;
				interpretUpdate(updateObject);
			}
			else if(object instanceof Delete) {
				Delete removeObject = (Delete) object;
				interpretRemove(removeObject);
			}
		}
		try {
			model.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static public void interpretLoad(Loader loadObject) {
		System.out.println("load...");
		if(loadObject instanceof LoadMetaModel) {
			loader.setMetamodelUrl(((LoadMetaModel) loadObject).getUrl());
		}
		if(loadObject instanceof LoadModel) {
			loader.setmodelUrl(((LoadModel) loadObject).getUrl());
			model = loader.loadModel();
		}
	}
	
	static public void interpretAdd(Add addObject) {
		System.out.println("add...");
		AddInterpreter addObj = new AddInterpreter(addObject);
		addObj.interpret(loader);
		System.out.println("end adding...");
	}
	
	static public void interpretUpdate(Update updateObject) {
		System.out.println("update...");
		UpdateInterpreter updateObj = new UpdateInterpreter(updateObject);
		updateObj.interpret(loader);
		System.out.println("end updating...");
		
	}
	
	static public void interpretRemove(Delete removeObject) {
		System.out.println("remove...");
		DeleteInterpreter deleteObj = new DeleteInterpreter(removeObject);
		deleteObj.interpret(loader);
		System.out.println("end removing...");
	}

}


