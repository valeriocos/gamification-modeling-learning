/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.status.parser.antlr;

import codeskills.designer.game.status.parser.antlr.internal.InternalStatusParser;
import codeskills.designer.game.status.services.StatusGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class StatusParser extends AbstractAntlrParser {

	@Inject
	private StatusGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalStatusParser createParser(XtextTokenStream stream) {
		return new InternalStatusParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "S";
	}

	public StatusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(StatusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
