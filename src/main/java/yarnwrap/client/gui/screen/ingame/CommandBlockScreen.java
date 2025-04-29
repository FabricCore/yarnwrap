package yarnwrap.client.gui.screen.ingame;
public class CommandBlockScreen { public net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained; public CommandBlockScreen(net.minecraft.client.gui.screen.ingame.CommandBlockScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.CommandBlockBlockEntity blockEntity() { return new yarnwrap.block.entity.CommandBlockBlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.CommandBlockBlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public static yarnwrap.block.entity.CommandBlockBlockEntity blockEntity() { return new yarnwrap.block.entity.CommandBlockBlockEntity(net.minecraft.client.gui.screen.ingame.CommandBlockScreen.blockEntity); }
// public static void blockEntity(yarnwrap.block.entity.CommandBlockBlockEntity value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.blockEntity = value.wrapperContained; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget redstoneTriggerButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.redstoneTriggerButton); }
// public void redstoneTriggerButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.redstoneTriggerButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.CyclingButtonWidget redstoneTriggerButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(net.minecraft.client.gui.screen.ingame.CommandBlockScreen.redstoneTriggerButton); }
// public static void redstoneTriggerButton(yarnwrap.client.gui.widget.CyclingButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.redstoneTriggerButton = value.wrapperContained; }

// public boolean autoActivate() { return wrapperContained.autoActivate; }
// public void autoActivate(boolean value) { wrapperContained.autoActivate = value; }
// public static boolean autoActivate() { return net.minecraft.client.gui.screen.ingame.CommandBlockScreen.autoActivate; }
// public static void autoActivate(boolean value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.autoActivate = value; }

// public boolean conditional() { return wrapperContained.conditional; }
// public void conditional(boolean value) { wrapperContained.conditional = value; }
// public static boolean conditional() { return net.minecraft.client.gui.screen.ingame.CommandBlockScreen.conditional; }
// public static void conditional(boolean value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.conditional = value; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget modeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.modeButton); }
// public void modeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.modeButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.CyclingButtonWidget modeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(net.minecraft.client.gui.screen.ingame.CommandBlockScreen.modeButton); }
// public static void modeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.modeButton = value.wrapperContained; }

// public Object mode() { return wrapperContained.mode; }
// // public void mode(Object value) { wrapperContained.mode = value; }
// // public static Object mode() { return net.minecraft.client.gui.screen.ingame.CommandBlockScreen.mode; }
// // public static void mode(Object value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.mode = value; }

// public yarnwrap.client.gui.widget.CyclingButtonWidget conditionalModeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(wrapperContained.conditionalModeButton); }
// public void conditionalModeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value) { wrapperContained.conditionalModeButton = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.CyclingButtonWidget conditionalModeButton() { return new yarnwrap.client.gui.widget.CyclingButtonWidget(net.minecraft.client.gui.screen.ingame.CommandBlockScreen.conditionalModeButton); }
// public static void conditionalModeButton(yarnwrap.client.gui.widget.CyclingButtonWidget value, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.conditionalModeButton = value.wrapperContained; }

public CommandBlockScreen(yarnwrap.block.entity.CommandBlockBlockEntity blockEntity) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CommandBlockScreen(blockEntity.wrapperContained); }
public void updateCommandBlock() { wrapperContained.updateCommandBlock(); }
// public static void updateCommandBlock() { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.updateCommandBlock(); }
// public yarnwrap.text.Text method_32643(Object value) { return new yarnwrap.text.Text(wrapperContained.method_32643(value)); }
// public static yarnwrap.text.Text method_32643(Object value, ) { return new yarnwrap.text.Text(net.minecraft.client.gui.screen.ingame.CommandBlockScreen.method_32643(value)); }
// public void method_32644(yarnwrap.client.gui.widget.CyclingButtonWidget button,Object mode) { wrapperContained.method_32644(button.wrapperContained,mode); }
// public static void method_32644(yarnwrap.client.gui.widget.CyclingButtonWidget button,Object mode, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.method_32644(button.wrapperContained,mode); }
// public void method_32645(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean autoActivate) { wrapperContained.method_32645(button.wrapperContained,autoActivate); }
// public static void method_32645(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean autoActivate, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.method_32645(button.wrapperContained,autoActivate); }
// public void method_32646(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean conditional) { wrapperContained.method_32646(button.wrapperContained,conditional); }
// public static void method_32646(yarnwrap.client.gui.widget.CyclingButtonWidget button,java.lang.Boolean conditional, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.method_32646(button.wrapperContained,conditional); }
// public void setButtonsActive(boolean active) { wrapperContained.setButtonsActive(active); }
// public static void setButtonsActive(boolean active, ) { net.minecraft.client.gui.screen.ingame.CommandBlockScreen.setButtonsActive(active); }

}