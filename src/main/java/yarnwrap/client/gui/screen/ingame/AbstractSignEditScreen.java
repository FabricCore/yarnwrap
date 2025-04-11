package yarnwrap.client.gui.screen.ingame;
public class AbstractSignEditScreen { public net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen wrapperContained; public AbstractSignEditScreen(net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.SignBlockEntity blockEntity() { return new yarnwrap.block.entity.SignBlockEntity(wrapperContained.blockEntity); }
// public void blockEntity(yarnwrap.block.entity.SignBlockEntity value) { wrapperContained.blockEntity = value.wrapperContained; }
// public java.lang.String[] messages() { return wrapperContained.messages; }
// public void messages(java.lang.String[] value) { wrapperContained.messages = value; }
// public yarnwrap.block.WoodType signType() { return new yarnwrap.block.WoodType(wrapperContained.signType); }
// public void signType(yarnwrap.block.WoodType value) { wrapperContained.signType = value.wrapperContained; }
// public int ticksSinceOpened() { return wrapperContained.ticksSinceOpened; }
// public void ticksSinceOpened(int value) { wrapperContained.ticksSinceOpened = value; }
// public int currentRow() { return wrapperContained.currentRow; }
// public void currentRow(int value) { wrapperContained.currentRow = value; }
// public yarnwrap.client.util.SelectionManager selectionManager() { return new yarnwrap.client.util.SelectionManager(wrapperContained.selectionManager); }
// public void selectionManager(yarnwrap.client.util.SelectionManager value) { wrapperContained.selectionManager = value.wrapperContained; }
// public yarnwrap.block.entity.SignText text() { return new yarnwrap.block.entity.SignText(wrapperContained.text); }
// public void text(yarnwrap.block.entity.SignText value) { wrapperContained.text = value.wrapperContained; }
// public boolean front() { return wrapperContained.front; }
// public void front(boolean value) { wrapperContained.front = value; }
// public AbstractSignEditScreen(yarnwrap.block.entity.SignBlockEntity blockEntity,boolean front,boolean filtered) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen(blockEntity.wrapperContained,front,filtered); }
// public AbstractSignEditScreen(yarnwrap.block.entity.SignBlockEntity blockEntity,boolean front,boolean filtered,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen(blockEntity.wrapperContained,front,filtered,title.wrapperContained); }
// public void translateForRender(yarnwrap.client.gui.DrawContext context,yarnwrap.block.BlockState state) { wrapperContained.translateForRender(context.wrapperContained,state.wrapperContained); }
// public void renderSignText(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSignText(context.wrapperContained); }
// public void renderSignBackground(yarnwrap.client.gui.DrawContext context,yarnwrap.block.BlockState state) { wrapperContained.renderSignBackground(context.wrapperContained,state.wrapperContained); }
// public void method_45657(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_45657(button.wrapperContained); }
// public void renderSign(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSign(context.wrapperContained); }
// public org.joml.Vector3f getTextScale() { return wrapperContained.getTextScale(); }
// public void finishEditing() { wrapperContained.finishEditing(); }
// public boolean canEdit() { return wrapperContained.canEdit(); }
// public void setCurrentRowMessage(java.lang.String message) { wrapperContained.setCurrentRowMessage(message); }
// public yarnwrap.text.Text method_49914(boolean line) { return new yarnwrap.text.Text(wrapperContained.method_49914(line)); }

}