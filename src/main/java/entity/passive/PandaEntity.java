package yarnwrap.entity.passive;
public class PandaEntity { public net.minecraft.entity.passive.PandaEntity wrapperContained; public PandaEntity(net.minecraft.entity.passive.PandaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d playingJump() { return new yarnwrap.util.math.Vec3d(wrapperContained.playingJump); }
// public yarnwrap.entity.ai.TargetPredicate ASK_FOR_BAMBOO_TARGET() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ASK_FOR_BAMBOO_TARGET); }
// public Object lookAtPlayerGoal() { return wrapperContained.lookAtPlayerGoal; }
public int MAIN_GENE_MUTATION_CHANCE() { return wrapperContained.MAIN_GENE_MUTATION_CHANCE; }
// public int SNEEZING_FLAG() { return wrapperContained.SNEEZING_FLAG; }
// public int PLAYING_FLAG() { return wrapperContained.PLAYING_FLAG; }
// public int SITTING_FLAG() { return wrapperContained.SITTING_FLAG; }
// public int LYING_ON_BACK_FLAG() { return wrapperContained.LYING_ON_BACK_FLAG; }
// public int EATING_ANIMATION_INTERVAL() { return wrapperContained.EATING_ANIMATION_INTERVAL; }
// public int HIDDEN_GENE_MUTATION_CHANCE() { return wrapperContained.HIDDEN_GENE_MUTATION_CHANCE; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public yarnwrap.entity.data.TrackedData ASK_FOR_BAMBOO_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ASK_FOR_BAMBOO_TICKS); }
// public java.util.function.Predicate IS_FOOD() { return wrapperContained.IS_FOOD; }
// public yarnwrap.entity.data.TrackedData MAIN_GENE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MAIN_GENE); }
public int playingTicks() { return wrapperContained.playingTicks; }
// public yarnwrap.entity.data.TrackedData PANDA_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PANDA_FLAGS); }
// public boolean shouldGetRevenge() { return wrapperContained.shouldGetRevenge; }
// public boolean shouldAttack() { return wrapperContained.shouldAttack; }
// public yarnwrap.entity.data.TrackedData SNEEZE_PROGRESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SNEEZE_PROGRESS); }
// public float rollOverAnimationProgress() { return wrapperContained.rollOverAnimationProgress; }
// public float lastRollOverAnimationProgress() { return wrapperContained.lastRollOverAnimationProgress; }
// public float lieOnBackAnimationProgress() { return wrapperContained.lieOnBackAnimationProgress; }
// public float lastLieOnBackAnimationProgress() { return wrapperContained.lastLieOnBackAnimationProgress; }
// public float sittingAnimationProgress() { return wrapperContained.sittingAnimationProgress; }
// public float lastSittingAnimationProgress() { return wrapperContained.lastSittingAnimationProgress; }
// public yarnwrap.entity.data.TrackedData EATING_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.EATING_TICKS); }
// public yarnwrap.entity.data.TrackedData HIDDEN_GENE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HIDDEN_GENE); }
// public boolean canEat(yarnwrap.item.ItemStack stack) { return wrapperContained.canEat(stack.wrapperContained); }
// public void stop() { wrapperContained.stop(); }
public boolean isIdle() { return wrapperContained.isIdle(); }
public Object createPandaAttributes() { return wrapperContained.createPandaAttributes(); }
public boolean isBrown() { return wrapperContained.isBrown(); }
// public void updateLieOnBackAnimation() { wrapperContained.updateLieOnBackAnimation(); }
public void setLyingOnBack(boolean lyingOnBack) { wrapperContained.setLyingOnBack(lyingOnBack); }
public Object getHiddenGene() { return wrapperContained.getHiddenGene(); }
public boolean isWorried() { return wrapperContained.isWorried(); }
// public void playEatingAnimation() { wrapperContained.playEatingAnimation(); }
public void setSitting(boolean sitting) { wrapperContained.setSitting(sitting); }
public boolean isLyingOnBack() { return wrapperContained.isLyingOnBack(); }
public void initGenes(yarnwrap.entity.passive.PandaEntity mother,yarnwrap.entity.passive.PandaEntity father) { wrapperContained.initGenes(mother.wrapperContained,father.wrapperContained); }
public void setAskForBambooTicks(int askForBambooTicks) { wrapperContained.setAskForBambooTicks(askForBambooTicks); }
// public Object getRandomGene() { return wrapperContained.getRandomGene(); }
public int getAskForBambooTicks() { return wrapperContained.getAskForBambooTicks(); }
public boolean isPlayful() { return wrapperContained.isPlayful(); }
// public void updateRollOverAnimation() { wrapperContained.updateRollOverAnimation(); }
public boolean isScaredByThunderstorm() { return wrapperContained.isScaredByThunderstorm(); }
public Object getMainGene() { return wrapperContained.getMainGene(); }
public boolean isPlaying() { return wrapperContained.isPlaying(); }
public boolean isEating() { return wrapperContained.isEating(); }
// public int getEatingTicks() { return wrapperContained.getEatingTicks(); }
// public void setMainGene(Object gene) { wrapperContained.setMainGene(gene); }
public int getSneezeProgress() { return wrapperContained.getSneezeProgress(); }
// public boolean hasPandaFlag(int bitmask) { return wrapperContained.hasPandaFlag(bitmask); }
public float getSittingAnimationProgress(float tickDelta) { return wrapperContained.getSittingAnimationProgress(tickDelta); }
public boolean isSitting() { return wrapperContained.isSitting(); }
// public void updateEatingAnimation() { wrapperContained.updateEatingAnimation(); }
// public void updatePlaying() { wrapperContained.updatePlaying(); }
public void resetAttributes() { wrapperContained.resetAttributes(); }
public void setSneezeProgress(int sneezeProgress) { wrapperContained.setSneezeProgress(sneezeProgress); }
public void setPlaying(boolean playing) { wrapperContained.setPlaying(playing); }
// public void updateSittingAnimation() { wrapperContained.updateSittingAnimation(); }
public boolean isSneezing() { return wrapperContained.isSneezing(); }
public void setSneezing(boolean sneezing) { wrapperContained.setSneezing(sneezing); }
// public void setHiddenGene(Object gene) { wrapperContained.setHiddenGene(gene); }
// public void sneeze() { wrapperContained.sneeze(); }
public boolean isLazy() { return wrapperContained.isLazy(); }
public boolean isWeak() { return wrapperContained.isWeak(); }
public void setEating(boolean eating) { wrapperContained.setEating(eating); }
public Object getProductGene() { return wrapperContained.getProductGene(); }
public float getLieOnBackAnimationProgress(float tickDelta) { return wrapperContained.getLieOnBackAnimationProgress(tickDelta); }
// public void setPandaFlag(int mask,boolean value) { wrapperContained.setPandaFlag(mask,value); }
// public void setEatingTicks(int eatingTicks) { wrapperContained.setEatingTicks(eatingTicks); }
public float getRollOverAnimationProgress(float tickDelta) { return wrapperContained.getRollOverAnimationProgress(tickDelta); }

}