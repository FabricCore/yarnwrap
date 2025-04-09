package yarnwrap.client.gui.screen.ingame;
public class JigsawBlockScreen { public net.minecraft.client.gui.screen.ingame.JigsawBlockScreen wrapperContained; public JigsawBlockScreen(net.minecraft.client.gui.screen.ingame.JigsawBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget finalStateField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.finalStateField); }
// public yarnwrap.block.entity.JigsawBlockEntity jigsaw() { return new yarnwrap.block.entity.JigsawBlockEntity(wrapperContained.jigsaw); }
// public yarnwrap.client.gui.widget.ButtonWidget doneButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.doneButton); }
// public yarnwrap.client.gui.widget.TextFieldWidget nameField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameField); }
// public yarnwrap.client.gui.widget.TextFieldWidget targetField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.targetField); }
// public yarnwrap.client.gui.widget.TextFieldWidget poolField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.poolField); }
// public yarnwrap.client.gui.widget.CyclingButtonWidget jointRotationButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.jointRotationButton); }
// public Object joint() { return wrapperContained.joint; }
// public int generationDepth() { return wrapperContained.generationDepth; }
// public boolean keepJigsaws() { return wrapperContained.keepJigsaws; }
// public yarnwrap.text.Text JOINT_LABEL_TEXT() { return new yarnwrap.text.Text(wrapperContained.JOINT_LABEL_TEXT); }
// public yarnwrap.text.Text POOL_TEXT() { return new yarnwrap.text.Text(wrapperContained.POOL_TEXT); }
// public yarnwrap.text.Text NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.NAME_TEXT); }
// public yarnwrap.text.Text TARGET_TEXT() { return new yarnwrap.text.Text(wrapperContained.TARGET_TEXT); }
// public yarnwrap.text.Text FINAL_STATE_TEXT() { return new yarnwrap.text.Text(wrapperContained.FINAL_STATE_TEXT); }
// public yarnwrap.client.gui.widget.ButtonWidget generateButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.generateButton); }
// public yarnwrap.text.Text PLACEMENT_PRIORITY_TEXT() { return new yarnwrap.text.Text(wrapperContained.PLACEMENT_PRIORITY_TEXT); }
// public yarnwrap.text.Text PLACEMENT_PRIORITY_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.PLACEMENT_PRIORITY_TOOLTIP); }
// public yarnwrap.text.Text SELECTION_PRIORITY_TEXT() { return new yarnwrap.text.Text(wrapperContained.SELECTION_PRIORITY_TEXT); }
// public yarnwrap.text.Text SELECTION_PRIORITY_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.SELECTION_PRIORITY_TOOLTIP); }
// public yarnwrap.client.gui.widget.TextFieldWidget selectionPriorityField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.selectionPriorityField); }
// public yarnwrap.client.gui.widget.TextFieldWidget placementPriorityField() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.placementPriorityField); }
// public void onDone() { wrapperContained.onDone(); }
// public void updateServer() { wrapperContained.updateServer(); }
// public void onCancel() { wrapperContained.onCancel(); }
// public void updateDoneButtonState() { wrapperContained.updateDoneButtonState(); }
// public void generate() { wrapperContained.generate(); }
// public int parseInt(java.lang.String value) { return wrapperContained.parseInt(value); }
public boolean isValidId(java.lang.String id) { return wrapperContained.isValidId(id); }

}