package yarnwrap.advancement;
public class AdvancementDisplay { public net.minecraft.advancement.AdvancementDisplay wrapperContained; public AdvancementDisplay(net.minecraft.advancement.AdvancementDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hidden() { return wrapperContained.hidden; }
// public void hidden(boolean value) { wrapperContained.hidden = value; }
// public static boolean hidden() { return net.minecraft.advancement.AdvancementDisplay.hidden; }
// public static void hidden(boolean value, ) { net.minecraft.advancement.AdvancementDisplay.hidden = value; }

// public yarnwrap.advancement.AdvancementFrame frame() { return new yarnwrap.advancement.AdvancementFrame(wrapperContained.frame); }
// public void frame(yarnwrap.advancement.AdvancementFrame value) { wrapperContained.frame = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementFrame frame() { return new yarnwrap.advancement.AdvancementFrame(net.minecraft.advancement.AdvancementDisplay.frame); }
// public static void frame(yarnwrap.advancement.AdvancementFrame value, ) { net.minecraft.advancement.AdvancementDisplay.frame = value.wrapperContained; }

// public boolean announceToChat() { return wrapperContained.announceToChat; }
// public void announceToChat(boolean value) { wrapperContained.announceToChat = value; }
// public static boolean announceToChat() { return net.minecraft.advancement.AdvancementDisplay.announceToChat; }
// public static void announceToChat(boolean value, ) { net.minecraft.advancement.AdvancementDisplay.announceToChat = value; }

// public boolean showToast() { return wrapperContained.showToast; }
// public void showToast(boolean value) { wrapperContained.showToast = value; }
// public static boolean showToast() { return net.minecraft.advancement.AdvancementDisplay.showToast; }
// public static void showToast(boolean value, ) { net.minecraft.advancement.AdvancementDisplay.showToast = value; }

// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public static yarnwrap.text.Text title() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementDisplay.title); }
// public static void title(yarnwrap.text.Text value, ) { net.minecraft.advancement.AdvancementDisplay.title = value.wrapperContained; }

// public yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(wrapperContained.icon); }
// public void icon(yarnwrap.item.ItemStack value) { wrapperContained.icon = value.wrapperContained; }
// public static yarnwrap.item.ItemStack icon() { return new yarnwrap.item.ItemStack(net.minecraft.advancement.AdvancementDisplay.icon); }
// public static void icon(yarnwrap.item.ItemStack value, ) { net.minecraft.advancement.AdvancementDisplay.icon = value.wrapperContained; }

// public yarnwrap.text.Text description() { return new yarnwrap.text.Text(wrapperContained.description); }
// public void description(yarnwrap.text.Text value) { wrapperContained.description = value.wrapperContained; }
// public static yarnwrap.text.Text description() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementDisplay.description); }
// public static void description(yarnwrap.text.Text value, ) { net.minecraft.advancement.AdvancementDisplay.description = value.wrapperContained; }

// public java.util.Optional background() { return wrapperContained.background; }
// public void background(java.util.Optional value) { wrapperContained.background = value; }
// public static java.util.Optional background() { return net.minecraft.advancement.AdvancementDisplay.background; }
// public static void background(java.util.Optional value, ) { net.minecraft.advancement.AdvancementDisplay.background = value; }

// public float y() { return wrapperContained.y; }
// public void y(float value) { wrapperContained.y = value; }
// public static float y() { return net.minecraft.advancement.AdvancementDisplay.y; }
// public static void y(float value, ) { net.minecraft.advancement.AdvancementDisplay.y = value; }

// public float x() { return wrapperContained.x; }
// public void x(float value) { wrapperContained.x = value; }
// public static float x() { return net.minecraft.advancement.AdvancementDisplay.x; }
// public static void x(float value, ) { net.minecraft.advancement.AdvancementDisplay.x = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementDisplay.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementDisplay.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.advancement.AdvancementDisplay.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.advancement.AdvancementDisplay.PACKET_CODEC = value.wrapperContained; }

public AdvancementDisplay(yarnwrap.item.ItemStack icon,yarnwrap.text.Text title,yarnwrap.text.Text description,java.util.Optional background,yarnwrap.advancement.AdvancementFrame frame,boolean showToast,boolean announceToChat,boolean hidden) { this.wrapperContained = new net.minecraft.advancement.AdvancementDisplay(icon.wrapperContained,title.wrapperContained,description.wrapperContained,background,frame.wrapperContained,showToast,announceToChat,hidden); }
public boolean shouldAnnounceToChat() { return wrapperContained.shouldAnnounceToChat(); }
// public static boolean shouldAnnounceToChat() { return net.minecraft.advancement.AdvancementDisplay.shouldAnnounceToChat(); }
public yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(wrapperContained.getTitle()); }
// public static yarnwrap.text.Text getTitle() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementDisplay.getTitle()); }
public java.util.Optional getBackground() { return wrapperContained.getBackground(); }
// public static java.util.Optional getBackground() { return net.minecraft.advancement.AdvancementDisplay.getBackground(); }
// public void toPacket(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
// public static void toPacket(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.advancement.AdvancementDisplay.toPacket(buf.wrapperContained); }
public yarnwrap.advancement.AdvancementFrame getFrame() { return new yarnwrap.advancement.AdvancementFrame(wrapperContained.getFrame()); }
// public static yarnwrap.advancement.AdvancementFrame getFrame() { return new yarnwrap.advancement.AdvancementFrame(net.minecraft.advancement.AdvancementDisplay.getFrame()); }
public void setPos(float x,float y) { wrapperContained.setPos(x,y); }
// public static void setPos(float x,float y, ) { net.minecraft.advancement.AdvancementDisplay.setPos(x,y); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
// public static yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementDisplay.getDescription()); }
public float getX() { return wrapperContained.getX(); }
// public static float getX() { return net.minecraft.advancement.AdvancementDisplay.getX(); }
public float getY() { return wrapperContained.getY(); }
// public static float getY() { return net.minecraft.advancement.AdvancementDisplay.getY(); }
// public yarnwrap.advancement.AdvancementDisplay fromPacket(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.advancement.AdvancementDisplay(wrapperContained.fromPacket(buf.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementDisplay fromPacket(yarnwrap.network.RegistryByteBuf buf, ) { return new yarnwrap.advancement.AdvancementDisplay(net.minecraft.advancement.AdvancementDisplay.fromPacket(buf.wrapperContained)); }
public yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(wrapperContained.getIcon()); }
// public static yarnwrap.item.ItemStack getIcon() { return new yarnwrap.item.ItemStack(net.minecraft.advancement.AdvancementDisplay.getIcon()); }
public boolean shouldShowToast() { return wrapperContained.shouldShowToast(); }
// public static boolean shouldShowToast() { return net.minecraft.advancement.AdvancementDisplay.shouldShowToast(); }
public boolean isHidden() { return wrapperContained.isHidden(); }
// public static boolean isHidden() { return net.minecraft.advancement.AdvancementDisplay.isHidden(); }
// public com.mojang.datafixers.kinds.App method_54939(Object instance) { return wrapperContained.method_54939(instance); }
// public static com.mojang.datafixers.kinds.App method_54939(Object instance, ) { return net.minecraft.advancement.AdvancementDisplay.method_54939(instance); }

}