package yarnwrap.entity.ai.control;
public class AquaticMoveControl { public net.minecraft.entity.ai.control.AquaticMoveControl wrapperContained; public AquaticMoveControl(net.minecraft.entity.ai.control.AquaticMoveControl wrapperContained) { this.wrapperContained = wrapperContained; }

// public int pitchChange() { return wrapperContained.pitchChange; }
// public void pitchChange(int value) { wrapperContained.pitchChange = value; }
// public int yawChange() { return wrapperContained.yawChange; }
// public void yawChange(int value) { wrapperContained.yawChange = value; }
// public float speedInWater() { return wrapperContained.speedInWater; }
// public void speedInWater(float value) { wrapperContained.speedInWater = value; }
// public float speedInAir() { return wrapperContained.speedInAir; }
// public void speedInAir(float value) { wrapperContained.speedInAir = value; }
// public boolean buoyant() { return wrapperContained.buoyant; }
// public void buoyant(boolean value) { wrapperContained.buoyant = value; }
public AquaticMoveControl(yarnwrap.entity.mob.MobEntity entity,int pitchChange,int yawChange,float speedInWater,float speedInAir,boolean buoyant) { this.wrapperContained = new net.minecraft.entity.ai.control.AquaticMoveControl(entity.wrapperContained,pitchChange,yawChange,speedInWater,speedInAir,buoyant); }

}