/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DataAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("codeskills/designer/data/parser/antlr/internal/InternalData.tokens");
	}
}
