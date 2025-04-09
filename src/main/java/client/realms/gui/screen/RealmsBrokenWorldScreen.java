package yarnwrap.client.realms.gui.screen;
public class RealmsBrokenWorldScreen { public net.minecraft.client.realms.gui.screen.RealmsBrokenWorldScreen wrapperContained; public RealmsBrokenWorldScreen(net.minecraft.client.realms.gui.screen.RealmsBrokenWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public long serverId() { return wrapperContained.serverId; }
// public net.minecraft.text.Text[] message() { return wrapperContained.message; }
// public int left_x() { return wrapperContained.left_x; }
// public java.util.List slotsThatHasBeenDownloaded() { return wrapperContained.slotsThatHasBeenDownloaded; }
// public int animTick() { return wrapperContained.animTick; }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public yarnwrap.util.Identifier SLOT_FRAME_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_FRAME_TEXTURE); }
// public void addButtons() { wrapperContained.addButtons(); }
// public int getFramePositionX(int i) { return wrapperContained.getFramePositionX(i); }
// public void drawSlotFrame(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY,boolean activeSlot,java.lang.String slotName,int slotId,long templateId,java.lang.String templateImage,boolean empty) { wrapperContained.drawSlotFrame(context.wrapperContained,x,y,mouseX,mouseY,activeSlot,slotName,slotId,templateId,templateImage,empty); }
// public void fetchServerData(long worldId) { wrapperContained.fetchServerData(worldId); }
// public void downloadWorld(int slotId) { wrapperContained.downloadWorld(slotId); }
// public boolean isMinigame() { return wrapperContained.isMinigame(); }
public void play() { wrapperContained.play(); }

}