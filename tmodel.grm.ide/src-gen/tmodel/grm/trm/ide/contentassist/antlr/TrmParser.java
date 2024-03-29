/*
 * generated by Xtext 2.12.0
 */
package tmodel.grm.trm.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import tmodel.grm.trm.ide.contentassist.antlr.internal.InternalTrmParser;
import tmodel.grm.trm.services.TrmGrammarAccess;

public class TrmParser extends AbstractContentAssistParser {

	@Inject
	private TrmGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTrmParser createParser() {
		InternalTrmParser result = new InternalTrmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLoaderAccess().getAlternatives(), "rule__Loader__Alternatives");
					put(grammarAccess.getOperationAccess().getAlternatives_0(), "rule__Operation__Alternatives_0");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getRunnerAccess().getGroup(), "rule__Runner__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getLoadMetaModelAccess().getGroup(), "rule__LoadMetaModel__Group__0");
					put(grammarAccess.getLoadModelAccess().getGroup(), "rule__LoadModel__Group__0");
					put(grammarAccess.getMAttributeAccess().getGroup(), "rule__MAttribute__Group__0");
					put(grammarAccess.getWhereClauseAccess().getGroup(), "rule__WhereClause__Group__0");
					put(grammarAccess.getWhereClauseAccess().getGroup_3(), "rule__WhereClause__Group_3__0");
					put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
					put(grammarAccess.getAddAccess().getGroup_3(), "rule__Add__Group_3__0");
					put(grammarAccess.getAddAccess().getGroup_4(), "rule__Add__Group_4__0");
					put(grammarAccess.getAddAccess().getGroup_4_3(), "rule__Add__Group_4_3__0");
					put(grammarAccess.getUpdateAccess().getGroup(), "rule__Update__Group__0");
					put(grammarAccess.getUpdateAccess().getGroup_6(), "rule__Update__Group_6__0");
					put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
					put(grammarAccess.getRunnerAccess().getLoaderAssignment_2(), "rule__Runner__LoaderAssignment_2");
					put(grammarAccess.getRunnerAccess().getLoaderAssignment_4(), "rule__Runner__LoaderAssignment_4");
					put(grammarAccess.getRunnerAccess().getOperationsAssignment_7(), "rule__Runner__OperationsAssignment_7");
					put(grammarAccess.getRunnerAccess().getOperationsAssignment_8(), "rule__Runner__OperationsAssignment_8");
					put(grammarAccess.getLoadMetaModelAccess().getUrlAssignment_3(), "rule__LoadMetaModel__UrlAssignment_3");
					put(grammarAccess.getLoadModelAccess().getUrlAssignment_3(), "rule__LoadModel__UrlAssignment_3");
					put(grammarAccess.getMAttributeAccess().getNameAssignment_1(), "rule__MAttribute__NameAssignment_1");
					put(grammarAccess.getMAttributeAccess().getValueAssignment_3(), "rule__MAttribute__ValueAssignment_3");
					put(grammarAccess.getWhereClauseAccess().getConditionsAssignment_2(), "rule__WhereClause__ConditionsAssignment_2");
					put(grammarAccess.getWhereClauseAccess().getConditionsAssignment_3_1(), "rule__WhereClause__ConditionsAssignment_3_1");
					put(grammarAccess.getAddAccess().getCibleElementAssignment_2(), "rule__Add__CibleElementAssignment_2");
					put(grammarAccess.getAddAccess().getInAssignment_3_1(), "rule__Add__InAssignment_3_1");
					put(grammarAccess.getAddAccess().getAttributesAssignment_4_2(), "rule__Add__AttributesAssignment_4_2");
					put(grammarAccess.getAddAccess().getAttributesAssignment_4_3_1(), "rule__Add__AttributesAssignment_4_3_1");
					put(grammarAccess.getAddAccess().getWhereClauseAssignment_5(), "rule__Add__WhereClauseAssignment_5");
					put(grammarAccess.getUpdateAccess().getCibleElementAssignment_2(), "rule__Update__CibleElementAssignment_2");
					put(grammarAccess.getUpdateAccess().getAttributesAssignment_5(), "rule__Update__AttributesAssignment_5");
					put(grammarAccess.getUpdateAccess().getAttributesAssignment_6_1(), "rule__Update__AttributesAssignment_6_1");
					put(grammarAccess.getUpdateAccess().getWhereClauseAssignment_8(), "rule__Update__WhereClauseAssignment_8");
					put(grammarAccess.getDeleteAccess().getCibleElementAssignment_2(), "rule__Delete__CibleElementAssignment_2");
					put(grammarAccess.getDeleteAccess().getWhereClauseAssignment_3(), "rule__Delete__WhereClauseAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TrmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TrmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
