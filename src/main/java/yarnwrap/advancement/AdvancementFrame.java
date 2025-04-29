package yarnwrap.advancement;
public class AdvancementFrame { public net.minecraft.advancement.AdvancementFrame wrapperContained; public AdvancementFrame(net.minecraft.advancement.AdvancementFrame wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.advancement.AdvancementFrame.id; }
// public static void id(java.lang.String value, ) { net.minecraft.advancement.AdvancementFrame.id = value; }

// public yarnwrap.util.Formatting titleFormat() { return new yarnwrap.util.Formatting(wrapperContained.titleFormat); }
// public void titleFormat(yarnwrap.util.Formatting value) { wrapperContained.titleFormat = value.wrapperContained; }
// public static yarnwrap.util.Formatting titleFormat() { return new yarnwrap.util.Formatting(net.minecraft.advancement.AdvancementFrame.titleFormat); }
// public static void titleFormat(yarnwrap.util.Formatting value, ) { net.minecraft.advancement.AdvancementFrame.titleFormat = value.wrapperContained; }

// public yarnwrap.text.Text toastText() { return new yarnwrap.text.Text(wrapperContained.toastText); }
// public void toastText(yarnwrap.text.Text value) { wrapperContained.toastText = value.wrapperContained; }
// public static yarnwrap.text.Text toastText() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementFrame.toastText); }
// public static void toastText(yarnwrap.text.Text value, ) { net.minecraft.advancement.AdvancementFrame.toastText = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementFrame.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementFrame.CODEC = value; }

// // public AdvancementFrame(java.lang.String id,int titleFormat) { this.wrapperContained = new net.minecraft.advancement.AdvancementFrame(id,titleFormat); }
public yarnwrap.text.Text getToastText() { return new yarnwrap.text.Text(wrapperContained.getToastText()); }
// public static yarnwrap.text.Text getToastText() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementFrame.getToastText()); }
public yarnwrap.text.MutableText getChatAnnouncementText(yarnwrap.advancement.AdvancementEntry advancementEntry,yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.text.MutableText(wrapperContained.getChatAnnouncementText(advancementEntry.wrapperContained,player.wrapperContained)); }
// public static yarnwrap.text.MutableText getChatAnnouncementText(yarnwrap.advancement.AdvancementEntry advancementEntry,yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.text.MutableText(net.minecraft.advancement.AdvancementFrame.getChatAnnouncementText(advancementEntry.wrapperContained,player.wrapperContained)); }
public yarnwrap.util.Formatting getTitleFormat() { return new yarnwrap.util.Formatting(wrapperContained.getTitleFormat()); }
// public static yarnwrap.util.Formatting getTitleFormat() { return new yarnwrap.util.Formatting(net.minecraft.advancement.AdvancementFrame.getTitleFormat()); }

}