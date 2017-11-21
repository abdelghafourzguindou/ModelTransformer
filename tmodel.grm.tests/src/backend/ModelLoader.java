package backend;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ModelLoader {

		private Resource model ;
		private Resource metamodel;
		private EPackage universalEPackage;
		private String modelUrl ;
		private String metamodelUrl ;
	
		
		public Resource getModel() {
			return model;
		}

		public Resource getMetamodel() {
			return metamodel;
		}

		public EPackage getUniversalEPackage() {
			return universalEPackage;
		}

		public String getmodelUrl() {
			return modelUrl;
		}

		public void setmodelUrl(String modelUrl) {
			this.modelUrl = modelUrl;
		}

		public String getMetamodelUrl() {
			return metamodelUrl;
		}

		public void setMetamodelUrl(String metamodelUrl) {
			this.metamodelUrl = metamodelUrl;
		}

		public Resource loadModel(){
			
			System.out.println(metamodelUrl);
			System.out.println(modelUrl);
			
			final String EXTENSION = getExtension(modelUrl);
			
			ResourceSet resourceSet = new ResourceSetImpl(); 	
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EXTENSION, new  XMIResourceFactoryImpl());
			
			metamodel = resourceSet.getResource(URI.createFileURI(metamodelUrl), true);
			universalEPackage = (EPackage) metamodel.getContents().get(0);
			
			resourceSet.getPackageRegistry().put(universalEPackage.getNsURI(), universalEPackage);
		
			model = resourceSet.getResource( URI.createURI( modelUrl,true), true);	
			
			return model;
		}
		
		public Resource run() {
			return loadModel();
		}
		
		public EObject getRootObject() {
			return model.getContents().get(0);
		}
		
		static private String getExtension (final String path) {
			Pattern pattern = Pattern.compile("(.w$)");
			Matcher matcher = pattern.matcher(path);
			String extension ="*";
			while(matcher.find()) {
				extension = matcher.group(1);
			}
			
			return extension;
		}	

	}
