package yarnwrap.entity.damage;
public class FallLocation { public net.minecraft.entity.damage.FallLocation wrapperContained; public FallLocation(net.minecraft.entity.damage.FallLocation wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String getDeathMessageKey() { return wrapperContained.getDeathMessageKey(); }
public yarnwrap.entity.damage.FallLocation fromEntity(yarnwrap.entity.LivingEntity entity) { return new yarnwrap.entity.damage.FallLocation(wrapperContained.fromEntity(entity.wrapperContained)); }
public yarnwrap.entity.damage.FallLocation fromBlockState(yarnwrap.block.BlockState state) { return new yarnwrap.entity.damage.FallLocation(wrapperContained.fromBlockState(state.wrapperContained)); }

}