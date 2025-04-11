package yarnwrap.entity.effect;
public class StatusEffectCategory { public net.minecraft.entity.effect.StatusEffectCategory wrapperContained; public StatusEffectCategory(net.minecraft.entity.effect.StatusEffectCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Formatting formatting() { return new yarnwrap.util.Formatting(wrapperContained.formatting); }
// public void formatting(yarnwrap.util.Formatting value) { wrapperContained.formatting = value.wrapperContained; }
// // public StatusEffectCategory(java.lang.String format) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectCategory(format); }
public yarnwrap.util.Formatting getFormatting() { return new yarnwrap.util.Formatting(wrapperContained.getFormatting()); }

}