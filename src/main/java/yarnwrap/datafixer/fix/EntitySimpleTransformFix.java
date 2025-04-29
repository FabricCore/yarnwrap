package yarnwrap.datafixer.fix;
public class EntitySimpleTransformFix { public net.minecraft.datafixer.fix.EntitySimpleTransformFix wrapperContained; public EntitySimpleTransformFix(net.minecraft.datafixer.fix.EntitySimpleTransformFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.util.Pair transform(java.lang.String choice,com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.transform(choice,entityDynamic); }
// public static com.mojang.datafixers.util.Pair transform(java.lang.String choice,com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.EntitySimpleTransformFix.transform(choice,entityDynamic); }

}