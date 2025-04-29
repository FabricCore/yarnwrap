package yarnwrap.entity.ai.control;
public class AquaticMoveControl { public net.minecraft.entity.ai.control.AquaticMoveControl wrapperContained; public AquaticMoveControl(net.minecraft.entity.ai.control.AquaticMoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pitchChange() { return wrapperContained.pitchChange; }
// public void pitchChange(int value) { wrapperContained.pitchChange = value; }
// public static int pitchChange() { return net.minecraft.entity.ai.control.AquaticMoveControl.pitchChange; }
// public static void pitchChange(int value, ) { net.minecraft.entity.ai.control.AquaticMoveControl.pitchChange = value; }

// public int yawChange() { return wrapperContained.yawChange; }
// public void yawChange(int value) { wrapperContained.yawChange = value; }
// public static int yawChange() { return net.minecraft.entity.ai.control.AquaticMoveControl.yawChange; }
// public static void yawChange(int value, ) { net.minecraft.entity.ai.control.AquaticMoveControl.yawChange = value; }

// public float speedInWater() { return wrapperContained.speedInWater; }
// public void speedInWater(float value) { wrapperContained.speedInWater = value; }
// public static float speedInWater() { return net.minecraft.entity.ai.control.AquaticMoveControl.speedInWater; }
// public static void speedInWater(float value, ) { net.minecraft.entity.ai.control.AquaticMoveControl.speedInWater = value; }

// public float speedInAir() { return wrapperContained.speedInAir; }
// public void speedInAir(float value) { wrapperContained.speedInAir = value; }
// public static float speedInAir() { return net.minecraft.entity.ai.control.AquaticMoveControl.speedInAir; }
// public static void speedInAir(float value, ) { net.minecraft.entity.ai.control.AquaticMoveControl.speedInAir = value; }

// public boolean buoyant() { return wrapperContained.buoyant; }
// public void buoyant(boolean value) { wrapperContained.buoyant = value; }
// public static boolean buoyant() { return net.minecraft.entity.ai.control.AquaticMoveControl.buoyant; }
// public static void buoyant(boolean value, ) { net.minecraft.entity.ai.control.AquaticMoveControl.buoyant = value; }

public AquaticMoveControl(yarnwrap.entity.mob.MobEntity entity,int pitchChange,int yawChange,float speedInWater,float speedInAir,boolean buoyant) { this.wrapperContained = new net.minecraft.entity.ai.control.AquaticMoveControl(entity.wrapperContained,pitchChange,yawChange,speedInWater,speedInAir,buoyant); }

}