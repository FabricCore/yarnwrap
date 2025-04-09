package yarnwrap.client.gui.screen.ingame;
public class AbstractSignEditScreen { public net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen wrapperContained; public AbstractSignEditScreen(net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.entity.SignBlockEntity blockEntity() { return new yarnwrap.block.entity.SignBlockEntity(wrapperContained.blockEntity); }
// public java.lang.String[] messages() { return wrapperContained.messages; }
// public yarnwrap.block.WoodType signType() { return new yarnwrap.block.WoodType(wrapperContained.signType); }
// public int ticksSinceOpened() { return wrapperContained.ticksSinceOpened; }
// public int currentRow() { return wrapperContained.currentRow; }
// public yarnwrap.client.util.SelectionManager selectionManager() { return new yarnwrap.client.util.SelectionManager(wrapperContained.selectionManager); }
// public yarnwrap.block.entity.SignText text() { return new yarnwrap.block.entity.SignText(wrapperContained.text); }
// public boolean front() { return wrapperContained.front; }
// public void translateForRender(yarnwrap.client.gui.DrawContext context,yarnwrap.block.BlockState state) { wrapperContained.translateForRender(context.wrapperContained,state.wrapperContained); }
// public void renderSignText(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSignText(context.wrapperContained); }
// public void renderSignBackground(yarnwrap.client.gui.DrawContext context,yarnwrap.block.BlockState state) { wrapperContained.renderSignBackground(context.wrapperContained,state.wrapperContained); }
// public void renderSign(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSign(context.wrapperContained); }
// public org.joml.Vector3f getTextScale() { return wrapperContained.getTextScale(); }
// public void finishEditing() { wrapperContained.finishEditing(); }
// public boolean canEdit() { return wrapperContained.canEdit(); }
// public void setCurrentRowMessage(java.lang.String message) { wrapperContained.setCurrentRowMessage(message); }

}