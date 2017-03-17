/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.ide.contentassist.antlr;

import codeskills.designer.data.ide.contentassist.antlr.internal.InternalDataParser;
import codeskills.designer.data.services.DataGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DataParser extends AbstractContentAssistParser {

	@Inject
	private DataGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDataParser createParser() {
		InternalDataParser result = new InternalDataParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getResourceAccess().getAlternatives(), "rule__Resource__Alternatives");
					put(grammarAccess.getContainerResourceAccess().getAlternatives(), "rule__ContainerResource__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getProjectAccess().getGroup_5(), "rule__Project__Group_5__0");
					put(grammarAccess.getProjectAccess().getGroup_6(), "rule__Project__Group_6__0");
					put(grammarAccess.getFolderAccess().getGroup(), "rule__Folder__Group__0");
					put(grammarAccess.getFolderAccess().getGroup_4(), "rule__Folder__Group_4__0");
					put(grammarAccess.getFolderAccess().getGroup_5(), "rule__Folder__Group_5__0");
					put(grammarAccess.getFileAccess().getGroup(), "rule__File__Group__0");
					put(grammarAccess.getFileAccess().getGroup_12(), "rule__File__Group_12__0");
					put(grammarAccess.getProjectAccess().getNameAssignment_4(), "rule__Project__NameAssignment_4");
					put(grammarAccess.getProjectAccess().getFilesAssignment_5_4(), "rule__Project__FilesAssignment_5_4");
					put(grammarAccess.getProjectAccess().getFoldersAssignment_6_4(), "rule__Project__FoldersAssignment_6_4");
					put(grammarAccess.getFolderAccess().getNameAssignment_3(), "rule__Folder__NameAssignment_3");
					put(grammarAccess.getFolderAccess().getFoldersAssignment_4_4(), "rule__Folder__FoldersAssignment_4_4");
					put(grammarAccess.getFolderAccess().getFilesAssignment_5_4(), "rule__Folder__FilesAssignment_5_4");
					put(grammarAccess.getFileAccess().getNameAssignment_3(), "rule__File__NameAssignment_3");
					put(grammarAccess.getFileAccess().getExtAssignment_7(), "rule__File__ExtAssignment_7");
					put(grammarAccess.getFileAccess().getChangedAssignment_11(), "rule__File__ChangedAssignment_11");
					put(grammarAccess.getFileAccess().getModelAssignment_12_1(), "rule__File__ModelAssignment_12_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDataParser typedParser = (InternalDataParser) parser;
			typedParser.entryRuleResource();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
