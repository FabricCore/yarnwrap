package yarnwrap.client.realms.gui.screen;
public class RealmsBrokenWorldScreen { public net.minecraft.client.realms.gui.screen.RealmsBrokenWorldScreen wrapperContained; public RealmsBrokenWorldScreen(net.minecraft.client.realms.gui.screen.RealmsBrokenWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gui.screen.Screen parent() { return new yarnwrap.client.gui.screen.Screen(wrapperContained.parent); }
// public void parent(yarnwrap.client.gui.screen.Screen value) { wrapperContained.parent = value.wrapperContained; }
// public long serverId() { return wrapperContained.serverId; }
// public void serverId(long value) { wrapperContained.serverId = value; }
// public net.minecraft.text.Text[] message() { return wrapperContained.message; }
// public void message(net.minecraft.text.Text[] value) { wrapperContained.message = value; }
// public int left_x() { return wrapperContained.left_x; }
// public void left_x(int value) { wrapperContained.left_x = value; }
// public java.util.List slotsThatHasBeenDownloaded() { return wrapperContained.slotsThatHasBeenDownloaded; }
// public void slotsThatHasBeenDownloaded(java.util.List value) { wrapperContained.slotsThatHasBeenDownloaded = value; }
// public int animTick() { return wrapperContained.animTick; }
// public void animTick(int value) { wrapperContained.animTick = value; }
// public yarnwrap.client.realms.dto.RealmsServer serverData() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.serverData); }
// public void serverData(yarnwrap.client.realms.dto.RealmsServer value) { wrapperContained.serverData = value.wrapperContained; }
// public yarnwrap.util.Identifier SLOT_FRAME_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SLOT_FRAME_TEXTURE); }
// public void SLOT_FRAME_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SLOT_FRAME_TEXTURE = value.wrapperContained; }
public RealmsBrokenWorldScreen(yarnwrap.client.gui.screen.Screen parent,long serverId,boolean minigame) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsBrokenWorldScreen(parent.wrapperContained,serverId,minigame); }
// public void addButtons() { wrapperContained.addButtons(); }
// public int getFramePositionX(int i) { return wrapperContained.getFramePositionX(i); }
// public void drawSlotFrame(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY,boolean activeSlot,java.lang.String slotName,int slotId,long templateId,java.lang.String templateImage,boolean empty) { wrapperContained.drawSlotFrame(context.wrapperContained,x,y,mouseX,mouseY,activeSlot,slotName,slotId,templateId,templateImage,empty); }
// public void fetchServerData(long worldId) { wrapperContained.fetchServerData(worldId); }
// public void downloadWorld(int slotId) { wrapperContained.downloadWorld(slotId); }
// public boolean isMinigame() { return wrapperContained.isMinigame(); }
// public void method_25120(int button) { wrapperContained.method_25120(button); }
// public void method_25121(int successful) { wrapperContained.method_25121(successful); }
// public void method_25122(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_25122(button.wrapperContained); }
public void play() { wrapperContained.play(); }
// public void method_25124(int button) { wrapperContained.method_25124(button); }

}