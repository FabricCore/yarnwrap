package yarnwrap.block;
public class EndGatewayBlock { public net.minecraft.block.EndGatewayBlock wrapperContained; public EndGatewayBlock(net.minecraft.block.EndGatewayBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.EndGatewayBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.EndGatewayBlock.CODEC = value; }

// public yarnwrap.util.math.Vec3d getTeleportVelocity(yarnwrap.entity.Entity entity) { return new yarnwrap.util.math.Vec3d(wrapperContained.getTeleportVelocity(entity.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getTeleportVelocity(yarnwrap.entity.Entity entity, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.block.EndGatewayBlock.getTeleportVelocity(entity.wrapperContained)); }

}