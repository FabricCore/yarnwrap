package yarnwrap.client.realms.gui;
public class RealmsWorldSlotButton { public net.minecraft.client.realms.gui.RealmsWorldSlotButton wrapperContained; public RealmsWorldSlotButton(net.minecraft.client.realms.gui.RealmsWorldSlotButton wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slotIndex() { return wrapperContained.slotIndex; }
// public void slotIndex(int value) { wrapperContained.slotIndex = value; }
// public Object state() { return wrapperContained.state; }
// // public void state(Object value) { wrapperContained.state = value; }
// public yarnwrap.util.Identifier SLOT_FRAME() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_FRAME); }
// public void SLOT_FRAME(yarnwrap.util.Identifier value) { wrapperContained.SLOT_FRAME = value.wrapperContained; }
public yarnwrap.util.Identifier EMPTY_FRAME() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_FRAME); }
// public void EMPTY_FRAME(yarnwrap.util.Identifier value) { wrapperContained.EMPTY_FRAME = value.wrapperContained; }
public yarnwrap.util.Identifier PANORAMA_0() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_0); }
// public void PANORAMA_0(yarnwrap.util.Identifier value) { wrapperContained.PANORAMA_0 = value.wrapperContained; }
public yarnwrap.util.Identifier PANORAMA_2() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_2); }
// public void PANORAMA_2(yarnwrap.util.Identifier value) { wrapperContained.PANORAMA_2 = value.wrapperContained; }
public yarnwrap.util.Identifier PANORAMA_3() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_3); }
// public void PANORAMA_3(yarnwrap.util.Identifier value) { wrapperContained.PANORAMA_3 = value.wrapperContained; }
// public yarnwrap.text.Text ACTIVE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ACTIVE_TOOLTIP); }
// public void ACTIVE_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.ACTIVE_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text MINIGAME_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MINIGAME_TOOLTIP); }
// public void MINIGAME_TOOLTIP(yarnwrap.text.Text value) { wrapperContained.MINIGAME_TOOLTIP = value.wrapperContained; }
// public yarnwrap.text.Text TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.TOOLTIP); }
// public void TOOLTIP(yarnwrap.text.Text value) { wrapperContained.TOOLTIP = value.wrapperContained; }
// public yarnwrap.util.Identifier CHECKMARK() { return new yarnwrap.util.Identifier(wrapperContained.CHECKMARK); }
// public void CHECKMARK(yarnwrap.util.Identifier value) { wrapperContained.CHECKMARK = value.wrapperContained; }
// public yarnwrap.text.Text MINIGAME_SLOT_NAME() { return new yarnwrap.text.Text(wrapperContained.MINIGAME_SLOT_NAME); }
// public void MINIGAME_SLOT_NAME(yarnwrap.text.Text value) { wrapperContained.MINIGAME_SLOT_NAME = value.wrapperContained; }
// public RealmsWorldSlotButton(int x,int y,int width,int height,int slotIndex,Object pressAction) { this.wrapperContained = new net.minecraft.client.realms.gui.RealmsWorldSlotButton(x,y,width,height,slotIndex,pressAction); }
public Object getState() { return wrapperContained.getState(); }
// public Object getAction(yarnwrap.client.realms.dto.RealmsServer server,boolean active,boolean minigame) { return wrapperContained.getAction(server.wrapperContained,active,minigame); }
public void setServer(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.setServer(server.wrapperContained); }
// public void updateTooltip(Object state,java.lang.String minigameName) { wrapperContained.updateTooltip(state,minigameName); }

}