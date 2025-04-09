package yarnwrap.util.math;
public class MathHelper { public net.minecraft.util.math.MathHelper wrapperContained; public MathHelper(net.minecraft.util.math.MathHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public double[] COSINE_OF_ARCSINE_TABLE() { return wrapperContained.COSINE_OF_ARCSINE_TABLE; }
// public int[] MULTIPLY_DE_BRUIJN_BIT_POSITION() { return wrapperContained.MULTIPLY_DE_BRUIJN_BIT_POSITION; }
public float SQUARE_ROOT_OF_TWO() { return wrapperContained.SQUARE_ROOT_OF_TWO; }
// public float[] SINE_TABLE() { return wrapperContained.SINE_TABLE; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public double[] ARCSINE_TABLE() { return wrapperContained.ARCSINE_TABLE; }
// public double ROUNDER_256THS() { return wrapperContained.ROUNDER_256THS; }
public float PI() { return wrapperContained.PI; }
public float HALF_PI() { return wrapperContained.HALF_PI; }
public float TAU() { return wrapperContained.TAU; }
public float RADIANS_PER_DEGREE() { return wrapperContained.RADIANS_PER_DEGREE; }
public float DEGREES_PER_RADIAN() { return wrapperContained.DEGREES_PER_RADIAN; }
public float EPSILON() { return wrapperContained.EPSILON; }
// public long HALF_PI_RADIANS_SINE_TABLE_INDEX() { return wrapperContained.HALF_PI_RADIANS_SINE_TABLE_INDEX; }
// public float DEGREES_TO_SINE_TABLE_INDEX() { return wrapperContained.DEGREES_TO_SINE_TABLE_INDEX; }
// public double ARCSINE_MACLAURIN_3() { return wrapperContained.ARCSINE_MACLAURIN_3; }
// public int ARCSINE_TABLE_LENGTH() { return wrapperContained.ARCSINE_TABLE_LENGTH; }
public org.joml.Vector3f Y_AXIS() { return wrapperContained.Y_AXIS; }
public org.joml.Vector3f X_AXIS() { return wrapperContained.X_AXIS; }
public org.joml.Vector3f Z_AXIS() { return wrapperContained.Z_AXIS; }
public double wrapDegrees(double degrees) { return wrapperContained.wrapDegrees(degrees); }
public int smallestEncompassingPowerOfTwo(int value) { return wrapperContained.smallestEncompassingPowerOfTwo(value); }
public int clamp(int value,int min,int max) { return wrapperContained.clamp(value,min,max); }
public float floorMod(float dividend,float divisor) { return wrapperContained.floorMod(dividend,divisor); }
public int ceilLog2(int value) { return wrapperContained.ceilLog2(value); }
public int parseInt(java.lang.String string,int fallback) { return wrapperContained.parseInt(string,fallback); }
public float nextFloat(yarnwrap.util.math.random.Random random,float min,float max) { return wrapperContained.nextFloat(random.wrapperContained,min,max); }
public double fastInverseSqrt(double x) { return wrapperContained.fastInverseSqrt(x); }
public boolean approximatelyEquals(float a,float b) { return wrapperContained.approximatelyEquals(a,b); }
public float stepTowards(float from,float to,float step) { return wrapperContained.stepTowards(from,to,step); }
public double atan2(double y,double x) { return wrapperContained.atan2(y,x); }
public double clamp(double value,double min,double max) { return wrapperContained.clamp(value,min,max); }
public int floorLog2(int value) { return wrapperContained.floorLog2(value); }
public boolean isPowerOfTwo(int value) { return wrapperContained.isPowerOfTwo(value); }
public int packRgb(float r,float g,float b) { return wrapperContained.packRgb(r,g,b); }
public int idealHash(int value) { return wrapperContained.idealHash(value); }
public float sqrt(float value) { return wrapperContained.sqrt(value); }
public float angleBetween(float first,float second) { return wrapperContained.angleBetween(first,second); }
public int floor(double value) { return wrapperContained.floor(value); }
public int binarySearch(int min,int max,java.util.function.IntPredicate predicate) { return wrapperContained.binarySearch(min,max,predicate); }
public float cos(float value) { return wrapperContained.cos(value); }
public float clamp(float value,float min,float max) { return wrapperContained.clamp(value,min,max); }
public double nextDouble(yarnwrap.util.math.random.Random random,double min,double max) { return wrapperContained.nextDouble(random.wrapperContained,min,max); }
public double floorMod(double dividend,double divisor) { return wrapperContained.floorMod(dividend,divisor); }
public int hsvToRgb(float hue,float saturation,float value) { return wrapperContained.hsvToRgb(hue,saturation,value); }
public double getLerpProgress(double value,double start,double end) { return wrapperContained.getLerpProgress(value,start,end); }
public long hashCode(int x,int y,int z) { return wrapperContained.hashCode(x,y,z); }
public long lfloor(double value) { return wrapperContained.lfloor(value); }
public float sin(float value) { return wrapperContained.sin(value); }
public int floor(float value) { return wrapperContained.floor(value); }
public java.util.UUID randomUuid(yarnwrap.util.math.random.Random random) { return wrapperContained.randomUuid(random.wrapperContained); }
public float abs(float value) { return wrapperContained.abs(value); }
public float subtractAngles(float start,float end) { return wrapperContained.subtractAngles(start,end); }
public int abs(int value) { return wrapperContained.abs(value); }
public int ceil(double value) { return wrapperContained.ceil(value); }
public double fractionalPart(double value) { return wrapperContained.fractionalPart(value); }
public int ceil(float value) { return wrapperContained.ceil(value); }
public int floorMod(int dividend,int divisor) { return wrapperContained.floorMod(dividend,divisor); }
public float stepUnwrappedAngleTowards(float from,float to,float step) { return wrapperContained.stepUnwrappedAngleTowards(from,to,step); }
public long hashCode(yarnwrap.util.math.Vec3i vec) { return wrapperContained.hashCode(vec.wrapperContained); }
public double clampedLerp(double start,double end,double delta) { return wrapperContained.clampedLerp(start,end,delta); }
public double absMax(double a,double b) { return wrapperContained.absMax(a,b); }
public int wrapDegrees(int degrees) { return wrapperContained.wrapDegrees(degrees); }
public float wrapDegrees(float degrees) { return wrapperContained.wrapDegrees(degrees); }
public java.util.UUID randomUuid() { return wrapperContained.randomUuid(); }
public int nextInt(yarnwrap.util.math.random.Random random,int min,int max) { return wrapperContained.nextInt(random.wrapperContained,min,max); }
public double perlinFade(double value) { return wrapperContained.perlinFade(value); }
public double lerp(double delta,double start,double end) { return wrapperContained.lerp(delta,start,end); }
public double lerp2(double deltaX,double deltaY,double x0y0,double x1y0,double x0y1,double x1y1) { return wrapperContained.lerp2(deltaX,deltaY,x0y0,x1y0,x0y1,x1y1); }
public double lerp3(double deltaX,double deltaY,double deltaZ,double x0y0z0,double x1y0z0,double x0y1z0,double x1y1z0,double x0y0z1,double x1y0z1,double x0y1z1,double x1y1z1) { return wrapperContained.lerp3(deltaX,deltaY,deltaZ,x0y0z0,x1y0z0,x0y1z0,x1y1z0,x0y0z1,x1y0z1,x0y1z1,x1y1z1); }
public float lerp(float delta,float start,float end) { return wrapperContained.lerp(delta,start,end); }
public float lerpAngleDegrees(float delta,float start,float end) { return wrapperContained.lerpAngleDegrees(delta,start,end); }
public int sign(double value) { return wrapperContained.sign(value); }
public float clampAngle(float value,float mean,float delta) { return wrapperContained.clampAngle(value,mean,delta); }
public boolean approximatelyEquals(double a,double b) { return wrapperContained.approximatelyEquals(a,b); }
public float fractionalPart(float value) { return wrapperContained.fractionalPart(value); }
public float fastInverseCbrt(float x) { return wrapperContained.fastInverseCbrt(x); }
public float wrap(float value,float maxDeviation) { return wrapperContained.wrap(value,maxDeviation); }
public float square(float n) { return wrapperContained.square(n); }
public int roundUpToMultiple(int value,int divisor) { return wrapperContained.roundUpToMultiple(value,divisor); }
public float nextBetween(yarnwrap.util.math.random.Random random,float min,float max) { return wrapperContained.nextBetween(random.wrapperContained,min,max); }
public int nextBetween(yarnwrap.util.math.random.Random random,int min,int max) { return wrapperContained.nextBetween(random.wrapperContained,min,max); }
public double clampedMap(double value,double oldStart,double oldEnd,double newStart,double newEnd) { return wrapperContained.clampedMap(value,oldStart,oldEnd,newStart,newEnd); }
public float nextGaussian(yarnwrap.util.math.random.Random random,float mean,float deviation) { return wrapperContained.nextGaussian(random.wrapperContained,mean,deviation); }
public double map(double value,double oldStart,double oldEnd,double newStart,double newEnd) { return wrapperContained.map(value,oldStart,oldEnd,newStart,newEnd); }
public double square(double n) { return wrapperContained.square(n); }
public double magnitude(double a,double b,double c) { return wrapperContained.magnitude(a,b,c); }
public int square(int n) { return wrapperContained.square(n); }
public double perlinFadeDerivative(double value) { return wrapperContained.perlinFadeDerivative(value); }
public float clampedLerp(float start,float end,float delta) { return wrapperContained.clampedLerp(start,end,delta); }
public float clampedMap(float value,float oldStart,float oldEnd,float newStart,float newEnd) { return wrapperContained.clampedMap(value,oldStart,oldEnd,newStart,newEnd); }
public float map(float value,float oldStart,float oldEnd,float newStart,float newEnd) { return wrapperContained.map(value,oldStart,oldEnd,newStart,newEnd); }
public float getLerpProgress(float value,float start,float end) { return wrapperContained.getLerpProgress(value,start,end); }
public long square(long n) { return wrapperContained.square(n); }
public int ceilDiv(int a,int b) { return wrapperContained.ceilDiv(a,b); }
public int roundDownToMultiple(double a,int b) { return wrapperContained.roundDownToMultiple(a,b); }
public double hypot(double a,double b) { return wrapperContained.hypot(a,b); }
public double squaredHypot(double a,double b) { return wrapperContained.squaredHypot(a,b); }
public double squaredMagnitude(double a,double b,double c) { return wrapperContained.squaredMagnitude(a,b,c); }
public float catmullRom(float delta,float p0,float p1,float p2,float p3) { return wrapperContained.catmullRom(delta,p0,p1,p2,p3); }
public java.util.stream.IntStream stream(int seed,int lowerBound,int upperBound,int steps) { return wrapperContained.stream(seed,lowerBound,upperBound,steps); }
public java.util.stream.IntStream stream(int seed,int lowerBound,int upperBound) { return wrapperContained.stream(seed,lowerBound,upperBound); }
public int floorDiv(int dividend,int divisor) { return wrapperContained.floorDiv(dividend,divisor); }
public boolean isMultipleOf(int a,int b) { return wrapperContained.isMultipleOf(a,b); }
public double inverseSqrt(double x) { return wrapperContained.inverseSqrt(x); }
public float inverseSqrt(float x) { return wrapperContained.inverseSqrt(x); }
public int lerp(float delta,int start,int end) { return wrapperContained.lerp(delta,start,end); }
public double lerpAngleDegrees(double delta,double start,double end) { return wrapperContained.lerpAngleDegrees(delta,start,end); }
public long clamp(long value,long min,long max) { return wrapperContained.clamp(value,min,max); }
public int lerpPositive(float delta,int start,int end) { return wrapperContained.lerpPositive(delta,start,end); }
public org.joml.Quaternionf rotateAround(org.joml.Vector3f axis,org.joml.Quaternionf rotation,org.joml.Quaternionf result) { return wrapperContained.rotateAround(axis,rotation,result); }
public int multiplyFraction(org.apache.commons.lang3.math.Fraction fraction,int multiplier) { return wrapperContained.multiplyFraction(fraction,multiplier); }
public int hsvToArgb(float hue,float saturation,float value,int alpha) { return wrapperContained.hsvToArgb(hue,saturation,value,alpha); }
public float magnitude(float a,float b,float c) { return wrapperContained.magnitude(a,b,c); }

}