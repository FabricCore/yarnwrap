package yarnwrap.datafixer.fix;
public class DecoratedPotFieldRenameFix { public net.minecraft.datafixer.fix.DecoratedPotFieldRenameFix wrapperContained; public DecoratedPotFieldRenameFix(net.minecraft.datafixer.fix.DecoratedPotFieldRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String DECORATED_POT_ID() { return wrapperContained.DECORATED_POT_ID; }
// public void DECORATED_POT_ID(java.lang.String value) { wrapperContained.DECORATED_POT_ID = value; }
// public static java.lang.String DECORATED_POT_ID() { return net.minecraft.datafixer.fix.DecoratedPotFieldRenameFix.DECORATED_POT_ID; }
// public static void DECORATED_POT_ID(java.lang.String value, ) { net.minecraft.datafixer.fix.DecoratedPotFieldRenameFix.DECORATED_POT_ID = value; }

public DecoratedPotFieldRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.DecoratedPotFieldRenameFix(outputSchema); }

}