package yarnwrap.client.gui.screen.report;
public class ReportScreen { public net.minecraft.client.gui.screen.report.ReportScreen wrapperContained; public ReportScreen(net.minecraft.client.gui.screen.report.ReportScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text SEND_TEXT() { return new yarnwrap.text.Text(wrapperContained.SEND_TEXT); }
// public void SEND_TEXT(yarnwrap.text.Text value) { wrapperContained.SEND_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text OBSERVED_WHAT_TEXT() { return new yarnwrap.text.Text(wrapperContained.OBSERVED_WHAT_TEXT); }
// public void OBSERVED_WHAT_TEXT(yarnwrap.text.Text value) { wrapperContained.OBSERVED_WHAT_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SELECT_REASON_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECT_REASON_TEXT); }
// public void SELECT_REASON_TEXT(yarnwrap.text.Text value) { wrapperContained.SELECT_REASON_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text MORE_COMMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.MORE_COMMENTS_TEXT); }
// public void MORE_COMMENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.MORE_COMMENTS_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public yarnwrap.client.session.report.AbuseReportContext context() { return new yarnwrap.client.session.report.AbuseReportContext(wrapperContained.context); }
// public void context(yarnwrap.client.session.report.AbuseReportContext value) { wrapperContained.context = value.wrapperContained; }
// public Object reportBuilder() { return wrapperContained.reportBuilder; }
// // public void reportBuilder(Object value) { wrapperContained.reportBuilder = value; }
// public yarnwrap.text.Text REPORT_SENT_MESSAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_SENT_MESSAGE_TEXT); }
// public void REPORT_SENT_MESSAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.REPORT_SENT_MESSAGE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SENDING_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.SENDING_TITLE_TEXT); }
// public void SENDING_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.SENDING_TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text SENT_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.SENT_TITLE_TEXT); }
// public void SENT_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.SENT_TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.ERROR_TITLE_TEXT); }
// public void ERROR_TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.ERROR_TITLE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text GENERIC_ERROR_TEXT() { return new yarnwrap.text.Text(wrapperContained.GENERIC_ERROR_TEXT); }
// public void GENERIC_ERROR_TEXT(yarnwrap.text.Text value) { wrapperContained.GENERIC_ERROR_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text DESCRIBE_TEXT() { return new yarnwrap.text.Text(wrapperContained.DESCRIBE_TEXT); }
// public void DESCRIBE_TEXT(yarnwrap.text.Text value) { wrapperContained.DESCRIBE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text COMMENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.COMMENTS_TEXT); }
// public void COMMENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.COMMENTS_TEXT = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gui.widget.ButtonWidget sendButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.sendButton); }
// public void sendButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.sendButton = value.wrapperContained; }
// public yarnwrap.text.Text ATTESTATION_TEXT() { return new yarnwrap.text.Text(wrapperContained.ATTESTATION_TEXT); }
// public void ATTESTATION_TEXT(yarnwrap.text.Text value) { wrapperContained.ATTESTATION_TEXT = value.wrapperContained; }
// public yarnwrap.client.gui.widget.CheckboxWidget checkbox() { return new yarnwrap.client.gui.widget.CheckboxWidget(wrapperContained.checkbox); }
// public void checkbox(yarnwrap.client.gui.widget.CheckboxWidget value) { wrapperContained.checkbox = value.wrapperContained; }
// public yarnwrap.client.gui.widget.DirectionalLayoutWidget layout() { return new yarnwrap.client.gui.widget.DirectionalLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.DirectionalLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public ReportScreen(yarnwrap.text.Text title,yarnwrap.client.gui.screen.Screen parent,yarnwrap.client.session.report.AbuseReportContext context,Object reportBuilder) { this.wrapperContained = new net.minecraft.client.gui.screen.report.ReportScreen(title.wrapperContained,parent.wrapperContained,context.wrapperContained,reportBuilder); }
// public void onSent() { wrapperContained.onSent(); }
// public void saveDraft() { wrapperContained.saveDraft(); }
// public void resetDraft() { wrapperContained.resetDraft(); }
// public yarnwrap.client.gui.widget.EditBoxWidget createCommentsBox(int width,int height,java.util.function.Consumer changeListener) { return new yarnwrap.client.gui.widget.EditBoxWidget(wrapperContained.createCommentsBox(width,height,changeListener)); }
// public void method_53565(Object validationError) { wrapperContained.method_53565(validationError); }
// public void method_53566(Object reportWithId) { wrapperContained.method_53566(reportWithId); }
// public java.lang.Object method_53567(java.lang.Object v,java.lang.Throwable throwable) { return wrapperContained.method_53567(v,throwable); }
// public void onSendError(java.lang.Throwable error) { wrapperContained.onSendError(error); }
// public void showError(yarnwrap.text.Text errorMessage) { wrapperContained.showError(errorMessage.wrapperContained); }
// public void trySend() { wrapperContained.trySend(); }
// public void onChange() { wrapperContained.onChange(); }
// public void addContent() { wrapperContained.addContent(); }
// public void addAttestationCheckboxAndSendButton() { wrapperContained.addAttestationCheckboxAndSendButton(); }
// public void method_61137(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_61137(button.wrapperContained); }
// public void method_61138(yarnwrap.client.gui.widget.CheckboxWidget checkbox,boolean attested) { wrapperContained.method_61138(checkbox.wrapperContained,attested); }
// public void method_61139(yarnwrap.client.gui.screen.report.ReportScreen child) { wrapperContained.method_61139(child.wrapperContained); }
// public void method_61140(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_61140(button.wrapperContained); }
// public void addTitle() { wrapperContained.addTitle(); }

}