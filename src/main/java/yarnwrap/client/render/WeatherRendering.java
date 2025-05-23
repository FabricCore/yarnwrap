package yarnwrap.client.render;
public class WeatherRendering { public net.minecraft.client.render.WeatherRendering wrapperContained; public WeatherRendering(net.minecraft.client.render.WeatherRendering wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier RAIN_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.RAIN_TEXTURE); }
// public void RAIN_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.RAIN_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier RAIN_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WeatherRendering.RAIN_TEXTURE); }
// public static void RAIN_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WeatherRendering.RAIN_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier SNOW_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SNOW_TEXTURE); }
// public void SNOW_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SNOW_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier SNOW_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.render.WeatherRendering.SNOW_TEXTURE); }
// public static void SNOW_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.WeatherRendering.SNOW_TEXTURE = value.wrapperContained; }

// public int soundChance() { return wrapperContained.soundChance; }
// public void soundChance(int value) { wrapperContained.soundChance = value; }
// public static int soundChance() { return net.minecraft.client.render.WeatherRendering.soundChance; }
// public static void soundChance(int value, ) { net.minecraft.client.render.WeatherRendering.soundChance = value; }

// public float[] NORMAL_LINE_DX() { return wrapperContained.NORMAL_LINE_DX; }
// public void NORMAL_LINE_DX(float[] value) { wrapperContained.NORMAL_LINE_DX = value; }
// public static float[] NORMAL_LINE_DX() { return net.minecraft.client.render.WeatherRendering.NORMAL_LINE_DX; }
// public static void NORMAL_LINE_DX(float[] value, ) { net.minecraft.client.render.WeatherRendering.NORMAL_LINE_DX = value; }

// public float[] NORMAL_LINE_DZ() { return wrapperContained.NORMAL_LINE_DZ; }
// public void NORMAL_LINE_DZ(float[] value) { wrapperContained.NORMAL_LINE_DZ = value; }
// public static float[] NORMAL_LINE_DZ() { return net.minecraft.client.render.WeatherRendering.NORMAL_LINE_DZ; }
// public static void NORMAL_LINE_DZ(float[] value, ) { net.minecraft.client.render.WeatherRendering.NORMAL_LINE_DZ = value; }

// public Object createRainPiece(yarnwrap.util.math.random.Random random,int ticks,int x,int yMin,int yMax,int z,int light,float tickProgress) { return wrapperContained.createRainPiece(random.wrapperContained,ticks,x,yMin,yMax,z,light,tickProgress); }
// public static Object createRainPiece(yarnwrap.util.math.random.Random random,int ticks,int x,int yMin,int yMax,int z,int light,float tickProgress, ) { return net.minecraft.client.render.WeatherRendering.createRainPiece(random.wrapperContained,ticks,x,yMin,yMax,z,light,tickProgress); }
// public void buildPrecipitationPieces(yarnwrap.world.World world,int ticks,float tickProgress,yarnwrap.util.math.Vec3d pos,int range,java.util.List rainOut,java.util.List snowOut) { wrapperContained.buildPrecipitationPieces(world.wrapperContained,ticks,tickProgress,pos.wrapperContained,range,rainOut,snowOut); }
// public static void buildPrecipitationPieces(yarnwrap.world.World world,int ticks,float tickProgress,yarnwrap.util.math.Vec3d pos,int range,java.util.List rainOut,java.util.List snowOut, ) { net.minecraft.client.render.WeatherRendering.buildPrecipitationPieces(world.wrapperContained,ticks,tickProgress,pos.wrapperContained,range,rainOut,snowOut); }
public void renderPrecipitation(yarnwrap.world.World world,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int ticks,float tickProgress,yarnwrap.util.math.Vec3d pos) { wrapperContained.renderPrecipitation(world.wrapperContained,vertexConsumers.wrapperContained,ticks,tickProgress,pos.wrapperContained); }
// public static void renderPrecipitation(yarnwrap.world.World world,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int ticks,float tickProgress,yarnwrap.util.math.Vec3d pos, ) { net.minecraft.client.render.WeatherRendering.renderPrecipitation(world.wrapperContained,vertexConsumers.wrapperContained,ticks,tickProgress,pos.wrapperContained); }
// public Object getPrecipitationAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getPrecipitationAt(world.wrapperContained,pos.wrapperContained); }
// public static Object getPrecipitationAt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.WeatherRendering.getPrecipitationAt(world.wrapperContained,pos.wrapperContained); }
// public void renderPieces(yarnwrap.client.render.VertexConsumer vertexConsumer,java.util.List pieces,yarnwrap.util.math.Vec3d pos,float intensity,int range,float gradient) { wrapperContained.renderPieces(vertexConsumer.wrapperContained,pieces,pos.wrapperContained,intensity,range,gradient); }
// public static void renderPieces(yarnwrap.client.render.VertexConsumer vertexConsumer,java.util.List pieces,yarnwrap.util.math.Vec3d pos,float intensity,int range,float gradient, ) { net.minecraft.client.render.WeatherRendering.renderPieces(vertexConsumer.wrapperContained,pieces,pos.wrapperContained,intensity,range,gradient); }
public void addParticlesAndSound(yarnwrap.client.world.ClientWorld world,yarnwrap.client.render.Camera camera,int ticks,yarnwrap.particle.ParticlesMode particlesMode) { wrapperContained.addParticlesAndSound(world.wrapperContained,camera.wrapperContained,ticks,particlesMode.wrapperContained); }
// public static void addParticlesAndSound(yarnwrap.client.world.ClientWorld world,yarnwrap.client.render.Camera camera,int ticks,yarnwrap.particle.ParticlesMode particlesMode, ) { net.minecraft.client.render.WeatherRendering.addParticlesAndSound(world.wrapperContained,camera.wrapperContained,ticks,particlesMode.wrapperContained); }
// public void renderPrecipitation(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Vec3d pos,int range,float gradient,java.util.List rainPieces,java.util.List snowPieces) { wrapperContained.renderPrecipitation(vertexConsumers.wrapperContained,pos.wrapperContained,range,gradient,rainPieces,snowPieces); }
// public static void renderPrecipitation(yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Vec3d pos,int range,float gradient,java.util.List rainPieces,java.util.List snowPieces, ) { net.minecraft.client.render.WeatherRendering.renderPrecipitation(vertexConsumers.wrapperContained,pos.wrapperContained,range,gradient,rainPieces,snowPieces); }
// public Object createSnowPiece(yarnwrap.util.math.random.Random random,int ticks,int x,int yMin,int yMax,int z,int light,float tickProgress) { return wrapperContained.createSnowPiece(random.wrapperContained,ticks,x,yMin,yMax,z,light,tickProgress); }
// public static Object createSnowPiece(yarnwrap.util.math.random.Random random,int ticks,int x,int yMin,int yMax,int z,int light,float tickProgress, ) { return net.minecraft.client.render.WeatherRendering.createSnowPiece(random.wrapperContained,ticks,x,yMin,yMax,z,light,tickProgress); }

}