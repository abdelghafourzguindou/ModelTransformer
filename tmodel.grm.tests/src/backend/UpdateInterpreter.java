package backend;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import tmodel.MAttribute;
import tmodel.Operation;

public class UpdateInterpreter extends Interpreter {

	public UpdateInterpreter(Operation operation) {
		super(operation);
	}

	@Override
	public void process(EObject elementObject) {
		List<MAttribute> attributes  = operation.getAttributes();
		 for(MAttribute c : attributes) {
			 EAttribute att = (EAttribute) elementObject.eClass().getEStructuralFeature(c.getName());
			 if(att != null) {
				 Object value = Converter.Converte(elementObject, att, c.getValue());
				 elementObject.eSet(att, value);
			 }
		 }		 
	}

}
