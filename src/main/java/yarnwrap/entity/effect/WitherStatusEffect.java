package yarnwrap.entity.effect;
public class WitherStatusEffect { public net.minecraft.entity.effect.WitherStatusEffect wrapperContained; public WitherStatusEffect(net.minecraft.entity.effect.WitherStatusEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public int FLOWER_CONTACT_EFFECT_DURATION() { return wrapperContained.FLOWER_CONTACT_EFFECT_DURATION; }
// public void FLOWER_CONTACT_EFFECT_DURATION(int value) { wrapperContained.FLOWER_CONTACT_EFFECT_DURATION = value; }
public static int FLOWER_CONTACT_EFFECT_DURATION() { return net.minecraft.entity.effect.WitherStatusEffect.FLOWER_CONTACT_EFFECT_DURATION; }
// public static void FLOWER_CONTACT_EFFECT_DURATION(int value, ) { net.minecraft.entity.effect.WitherStatusEffect.FLOWER_CONTACT_EFFECT_DURATION = value; }


}