package backend;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

import tmodel.Add;
import tmodel.MAttribute;
import tmodel.Operation;

public class AddInterpreter extends Interpreter {

	public AddInterpreter(Operation operation) {
		super(operation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void process(EObject element) {
		
		EFactory univInstance = universalEPackage.getEFactoryInstance();
		EObject elementToAdd = univInstance.create((EClass) getClassifier());

		List<MAttribute> attributes  = operation.getAttributes();
		 for(MAttribute c : attributes) {
			 EAttribute att = (EAttribute) elementToAdd.eClass().getEStructuralFeature(c.getName());
			 if(att != null) {
				 Object value = Converter.Converte(elementToAdd, att, c.getValue());
				 elementToAdd.eSet(att, value);
			 }
		 }		 
		
		System.out.println("start adding...");
		
		((EList<EObject>) element
				 .eGet(element.eClass()
				 .getEStructuralFeature(operation.getCibleElement()), true))
		 		 .add(elementToAdd);		
	}
	
	protected EClassifier getClassifier() {
		for(EClassifier e  : universalEPackage.getEClassifiers() )
			if(operation.getCibleElement().equalsIgnoreCase(e.getName()))
				return e ;
		return null ;
	}
	
	@Override
	protected boolean checkName(EObject element) {
		return element.eClass().getName().equalsIgnoreCase(((Add)operation).getIn());
	}
}
