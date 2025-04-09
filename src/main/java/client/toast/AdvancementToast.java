package yarnwrap.client.toast;
public class AdvancementToast { public net.minecraft.client.toast.AdvancementToast wrapperContained; public AdvancementToast(net.minecraft.client.toast.AdvancementToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry advancement() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.advancement); }
// public boolean soundPlayed() { return wrapperContained.soundPlayed; }
public int DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }

}