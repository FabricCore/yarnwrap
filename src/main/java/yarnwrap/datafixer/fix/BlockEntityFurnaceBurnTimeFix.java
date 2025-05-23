package yarnwrap.datafixer.fix;
public class BlockEntityFurnaceBurnTimeFix { public net.minecraft.datafixer.fix.BlockEntityFurnaceBurnTimeFix wrapperContained; public BlockEntityFurnaceBurnTimeFix(net.minecraft.datafixer.fix.BlockEntityFurnaceBurnTimeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityFurnaceBurnTimeFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String blockEntityId) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityFurnaceBurnTimeFix(outputSchema,blockEntityId); }
public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fix(dynamic); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.BlockEntityFurnaceBurnTimeFix.fix(dynamic); }

}