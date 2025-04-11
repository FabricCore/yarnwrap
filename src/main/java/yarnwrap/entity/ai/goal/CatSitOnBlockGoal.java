package yarnwrap.entity.ai.goal;
public class CatSitOnBlockGoal { public net.minecraft.entity.ai.goal.CatSitOnBlockGoal wrapperContained; public CatSitOnBlockGoal(net.minecraft.entity.ai.goal.CatSitOnBlockGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.CatEntity cat() { return new yarnwrap.entity.passive.CatEntity(wrapperContained.cat); }
// public void cat(yarnwrap.entity.passive.CatEntity value) { wrapperContained.cat = value.wrapperContained; }
public CatSitOnBlockGoal(yarnwrap.entity.passive.CatEntity cat,double speed) { this.wrapperContained = new net.minecraft.entity.ai.goal.CatSitOnBlockGoal(cat.wrapperContained,speed); }
// public boolean method_27793(Object state) { return wrapperContained.method_27793(state); }
// public java.lang.Boolean method_27794(yarnwrap.block.enums.BedPart part) { return wrapperContained.method_27794(part.wrapperContained); }

}