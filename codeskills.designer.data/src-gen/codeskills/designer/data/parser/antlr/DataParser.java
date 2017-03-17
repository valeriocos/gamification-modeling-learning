/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.parser.antlr;

import codeskills.designer.data.parser.antlr.internal.InternalDataParser;
import codeskills.designer.data.services.DataGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class DataParser extends AbstractAntlrParser {

	@Inject
	private DataGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDataParser createParser(XtextTokenStream stream) {
		return new InternalDataParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Resource";
	}

	public DataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}