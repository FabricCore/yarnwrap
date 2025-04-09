package yarnwrap.client.realms.gui;
public class RealmsWorldSlotButton { public net.minecraft.client.realms.gui.RealmsWorldSlotButton wrapperContained; public RealmsWorldSlotButton(net.minecraft.client.realms.gui.RealmsWorldSlotButton wrapperContained) { this.wrapperContained = wrapperContained; }

// public int slotIndex() { return wrapperContained.slotIndex; }
// public Object state() { return wrapperContained.state; }
// public yarnwrap.util.Identifier SLOT_FRAME() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_FRAME); }
public yarnwrap.util.Identifier EMPTY_FRAME() { return new yarnwrap.util.Identifier(wrapperContained.EMPTY_FRAME); }
public yarnwrap.util.Identifier PANORAMA_0() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_0); }
public yarnwrap.util.Identifier PANORAMA_2() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_2); }
public yarnwrap.util.Identifier PANORAMA_3() { return new yarnwrap.util.Identifier(wrapperContained.PANORAMA_3); }
// public yarnwrap.text.Text ACTIVE_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.ACTIVE_TOOLTIP); }
// public yarnwrap.text.Text MINIGAME_TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.MINIGAME_TOOLTIP); }
// public yarnwrap.text.Text TOOLTIP() { return new yarnwrap.text.Text(wrapperContained.TOOLTIP); }
// public yarnwrap.util.Identifier CHECKMARK() { return new yarnwrap.util.Identifier(wrapperContained.CHECKMARK); }
// public yarnwrap.text.Text MINIGAME_SLOT_NAME() { return new yarnwrap.text.Text(wrapperContained.MINIGAME_SLOT_NAME); }
public Object getState() { return wrapperContained.getState(); }
// public Object getAction(yarnwrap.client.realms.dto.RealmsServer server,boolean active,boolean minigame) { return wrapperContained.getAction(server.wrapperContained,active,minigame); }
public void setServer(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.setServer(server.wrapperContained); }
// public void updateTooltip(Object state,java.lang.String minigameName) { wrapperContained.updateTooltip(state,minigameName); }

}