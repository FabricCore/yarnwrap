package yarnwrap.client.gui.screen.world;
public class EditGameRulesScreen { public net.minecraft.client.gui.screen.world.EditGameRulesScreen wrapperContained; public EditGameRulesScreen(net.minecraft.client.gui.screen.world.EditGameRulesScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Consumer ruleSaver() { return wrapperContained.ruleSaver; }
// public void ruleSaver(java.util.function.Consumer value) { wrapperContained.ruleSaver = value; }
// public java.util.Set invalidRuleWidgets() { return wrapperContained.invalidRuleWidgets; }
// public void invalidRuleWidgets(java.util.Set value) { wrapperContained.invalidRuleWidgets = value; }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public void doneButton(yarnwrap.client.gui.widget.ButtonWidget value) { wrapperContained.doneButton = value.wrapperContained; }
// public yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(wrapperContained.gameRules); }
// public void gameRules(yarnwrap.world.GameRules value) { wrapperContained.gameRules = value.wrapperContained; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public Object ruleListWidget() { return wrapperContained.ruleListWidget; }
// // public void ruleListWidget(Object value) { wrapperContained.ruleListWidget = value; }
public EditGameRulesScreen(yarnwrap.world.GameRules gameRules,java.util.function.Consumer ruleSaveConsumer) { this.wrapperContained = new net.minecraft.client.gui.screen.world.EditGameRulesScreen(gameRules.wrapperContained,ruleSaveConsumer); }
// public void method_27619(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_27619(button.wrapperContained); }
// public void markInvalid(Object ruleWidget) { wrapperContained.markInvalid(ruleWidget); }
// public void markValid(Object ruleWidget) { wrapperContained.markValid(ruleWidget); }
// public void updateDoneButton() { wrapperContained.updateDoneButton(); }
// public void method_48682(yarnwrap.client.gui.screen.world.EditGameRulesScreen child) { wrapperContained.method_48682(child.wrapperContained); }
// public void method_57770(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_57770(button.wrapperContained); }

}