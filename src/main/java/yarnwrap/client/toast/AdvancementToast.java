package yarnwrap.client.toast;
public class AdvancementToast { public net.minecraft.client.toast.AdvancementToast wrapperContained; public AdvancementToast(net.minecraft.client.toast.AdvancementToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementEntry advancement() { return new yarnwrap.advancement.AdvancementEntry(wrapperContained.advancement); }
// public void advancement(yarnwrap.advancement.AdvancementEntry value) { wrapperContained.advancement = value.wrapperContained; }
// public boolean soundPlayed() { return wrapperContained.soundPlayed; }
// public void soundPlayed(boolean value) { wrapperContained.soundPlayed = value; }
public int DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public void DEFAULT_DURATION_MS(int value) { wrapperContained.DEFAULT_DURATION_MS = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
public AdvancementToast(yarnwrap.advancement.AdvancementEntry advancement) { this.wrapperContained = new net.minecraft.client.toast.AdvancementToast(advancement.wrapperContained); }

}