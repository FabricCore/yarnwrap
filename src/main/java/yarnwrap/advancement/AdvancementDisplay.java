package yarnwrap.advancement;
public class AdvancementDisplay { public net.minecraft.advancement.AdvancementDisplay wrapperContained; public AdvancementDisplay(net.minecraft.advancement.AdvancementDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hidden() { return wrapperContained.hidden; }
// public void hidden(boolean value) { wrapperContained.hidden = value; }
// public yarnwrap.advancement.AdvancementFrame frame() { return new yarnwrap.advancement.AdvancementFrame(wrapperContained.frame); }
// public void frame(yarnwrap.advancement.AdvancementFrame value) { wrapperContained.frame = value.wrapperContained; }
// public boolean announceToChat() { return wrapperContained.announceToChat; }
// public void announceToChat(boolean value) { wrapperContained.announceToChat = value; }
// public boolean showToast() { return wrapperContained.showToast; }
// public void showToast(boolean value) { wrapperContained.showToast = value; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(wrapperContained.icon); }
// public void icon(yarnwrap.item.ItemStack value) { wrapperContained.icon = value.wrapperContained; }
// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public java.util.Optional background() { return wrapperContained.background; }
// public void background(java.util.Optional value) { wrapperContained.background = value; }
// public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
// public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public boolean shouldAnnounceToChat() { return wrapperContained.shouldAnnounceToChat(); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
public java.util.Optional getBackground() { return wrapperContained.getBackground(); }
// public void toPacket(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
public yarnwrap.advancement.AdvancementFrame getFrame() { return new yarnwrap.advancement.AdvancementFrame(wrapperContained.getFrame()); }
public void setPos(float x,float y) { wrapperContained.setPos(x,y); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
public float getX() { return wrapperContained.getX(); }
public float getY() { return wrapperContained.getY(); }
// public yarnwrap.advancement.AdvancementDisplay fromPacket(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.advancement.AdvancementDisplay(wrapperContained.fromPacket(buf.wrapperContained)); }
public yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(wrapperContained.getIcon()); }
public boolean shouldShowToast() { return wrapperContained.shouldShowToast(); }
public boolean isHidden() { return wrapperContained.isHidden(); }

}