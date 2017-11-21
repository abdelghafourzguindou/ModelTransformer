package backend;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import tmodel.MAttribute;
import tmodel.Operation;


public abstract class Interpreter {
	
	EPackage universalEPackage;
	Operation operation;
	
	public Interpreter(Operation operation) {
		this.operation = operation;
	}
	
	public void interpret(ModelLoader loader) {
		universalEPackage = universalEPackage!=null? universalEPackage: loader.getUniversalEPackage();
		EObject root = loader.getRootObject();
		Object whereClause = operation.getWhereClause();
		TreeIterator<EObject> it = root.eAllContents();
		EObject element = null;
		
		element = it.next();
		
		if(whereClause != null) {
			if(check(root)) process(root);
		}
		else if(check(root)) {
			process(root);
		}

		while(it.hasNext()) {
			element = it.next();
			
			
			if(whereClause != null) {
				if(check(element)) process(element);
			}
			else if(check(element)) {
				process(element);
			}
		}
		
	}
	
	public abstract void process(EObject elementObject);
	
	protected boolean check(EObject element) {
		return checkName(element) && checkConditionsAttribute(element) && checkConditionsValues(element);
	}

	protected boolean checkConditionsValues(EObject element) {	
		List<MAttribute> listAttr = operation.getWhereClause().getConditions();
		for(MAttribute attr: listAttr) {
			EStructuralFeature att = element.eClass().getEStructuralFeature(attr.getName());
			 if(att == null || !element.eGet(att).equals(attr.getValue()))
				 return false ;
		}
		return true;
	}
	
	protected boolean checkName(EObject element) {
		return operation.getCibleElement().equalsIgnoreCase(element.eClass().getName());
	}
	
	protected boolean checkConditionsAttribute(EObject element) {
		List<MAttribute> listAttr = operation.getWhereClause().getConditions();
		for(MAttribute attr: listAttr) {
			EStructuralFeature att = element.eClass().getEStructuralFeature(attr.getName());
			 if(att == null)
				 return false ;
		}
		return true;
	}

}


