/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.status.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractStatusValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(codeskills.designer.game.status.status.StatusPackage.eINSTANCE);
		return result;
	}
	
}
