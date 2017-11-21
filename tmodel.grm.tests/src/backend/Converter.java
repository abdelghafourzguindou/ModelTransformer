package backend;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;


public class Converter {

	public static Object Converte(EObject element, EAttribute attribute, String value) {
		Object object = element.eGet((EStructuralFeature) attribute);
		if (object instanceof Integer)
			return new Integer(value);
		if (object instanceof Double)
			return new Double(value);
		if (object instanceof Long)
			return new Long(value);
		if (object instanceof Short)
			return new Short(value);
		if (object instanceof Boolean)
			return new Boolean(value);
		if (object instanceof Long)
			return new Long(value);
		if (object instanceof Long)
			return new Long(value);
		return value;
	}
}