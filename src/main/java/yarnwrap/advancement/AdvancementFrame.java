package yarnwrap.advancement;
public class AdvancementFrame { public net.minecraft.advancement.AdvancementFrame wrapperContained; public AdvancementFrame(net.minecraft.advancement.AdvancementFrame wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public yarnwrap.util.Formatting titleFormat() { return new yarnwrap.util.Formatting(wrapperContained.titleFormat); }
// public void titleFormat(yarnwrap.util.Formatting value) { wrapperContained.titleFormat = value.wrapperContained; }
// public yarnwrap.text.Text toastText() { return new yarnwrap.text.Text(wrapperContained.toastText); }
// public void toastText(yarnwrap.text.Text value) { wrapperContained.toastText = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// // public AdvancementFrame(java.lang.String id,int titleFormat) { this.wrapperContained = new net.minecraft.advancement.AdvancementFrame(id,titleFormat); }
public yarnwrap.text.Text getToastText() { return new yarnwrap.text.Text(wrapperContained.getToastText()); }
public yarnwrap.text.MutableText getChatAnnouncementText(yarnwrap.advancement.AdvancementEntry advancementEntry,yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.text.MutableText(wrapperContained.getChatAnnouncementText(advancementEntry.wrapperContained,player.wrapperContained)); }
public yarnwrap.util.Formatting getTitleFormat() { return new yarnwrap.util.Formatting(wrapperContained.getTitleFormat()); }

}