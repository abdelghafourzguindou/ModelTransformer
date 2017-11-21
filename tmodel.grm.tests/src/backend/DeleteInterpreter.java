package backend;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import tmodel.Operation;

public class DeleteInterpreter extends Interpreter {

	public DeleteInterpreter(Operation operation) {
		super(operation);
	}

	@Override
	public void process(EObject element) {
		System.out.println(element.eClass().getName());
		EcoreUtil.delete(element, true);
	}
}
