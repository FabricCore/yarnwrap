package yarnwrap.datafixer.fix;
public class StriderGravityFix { public net.minecraft.datafixer.fix.StriderGravityFix wrapperContained; public StriderGravityFix(net.minecraft.datafixer.fix.StriderGravityFix wrapperContained) { this.wrapperContained = wrapperContained; }

public StriderGravityFix(com.mojang.datafixers.schemas.Schema outputschema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.StriderGravityFix(outputschema,changesType); }
public com.mojang.serialization.Dynamic updateNoGravityNbt(com.mojang.serialization.Dynamic striderDynamic) { return wrapperContained.updateNoGravityNbt(striderDynamic); }

}