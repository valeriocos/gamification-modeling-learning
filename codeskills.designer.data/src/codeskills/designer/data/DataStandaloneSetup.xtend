/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DataStandaloneSetup extends DataStandaloneSetupGenerated {

	def static void doSetup() {
		new DataStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
