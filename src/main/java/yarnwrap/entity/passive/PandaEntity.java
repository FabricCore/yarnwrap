package yarnwrap.entity.passive;
public class PandaEntity { public net.minecraft.entity.passive.PandaEntity wrapperContained; public PandaEntity(net.minecraft.entity.passive.PandaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d playingJump() { return new yarnwrap.util.math.Vec3d(wrapperContained.playingJump); }
// public void playingJump(yarnwrap.util.math.Vec3d value) { wrapperContained.playingJump = value.wrapperContained; }
// public yarnwrap.entity.ai.TargetPredicate ASK_FOR_BAMBOO_TARGET() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.ASK_FOR_BAMBOO_TARGET); }
// public void ASK_FOR_BAMBOO_TARGET(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.ASK_FOR_BAMBOO_TARGET = value.wrapperContained; }
// public Object lookAtPlayerGoal() { return wrapperContained.lookAtPlayerGoal; }
// // public void lookAtPlayerGoal(Object value) { wrapperContained.lookAtPlayerGoal = value; }
public int MAIN_GENE_MUTATION_CHANCE() { return wrapperContained.MAIN_GENE_MUTATION_CHANCE; }
// public void MAIN_GENE_MUTATION_CHANCE(int value) { wrapperContained.MAIN_GENE_MUTATION_CHANCE = value; }
// public int SNEEZING_FLAG() { return wrapperContained.SNEEZING_FLAG; }
// public void SNEEZING_FLAG(int value) { wrapperContained.SNEEZING_FLAG = value; }
// public int PLAYING_FLAG() { return wrapperContained.PLAYING_FLAG; }
// public void PLAYING_FLAG(int value) { wrapperContained.PLAYING_FLAG = value; }
// public int SITTING_FLAG() { return wrapperContained.SITTING_FLAG; }
// public void SITTING_FLAG(int value) { wrapperContained.SITTING_FLAG = value; }
// public int LYING_ON_BACK_FLAG() { return wrapperContained.LYING_ON_BACK_FLAG; }
// public void LYING_ON_BACK_FLAG(int value) { wrapperContained.LYING_ON_BACK_FLAG = value; }
// public int EATING_ANIMATION_INTERVAL() { return wrapperContained.EATING_ANIMATION_INTERVAL; }
// public void EATING_ANIMATION_INTERVAL(int value) { wrapperContained.EATING_ANIMATION_INTERVAL = value; }
// public int HIDDEN_GENE_MUTATION_CHANCE() { return wrapperContained.HIDDEN_GENE_MUTATION_CHANCE; }
// public void HIDDEN_GENE_MUTATION_CHANCE(int value) { wrapperContained.HIDDEN_GENE_MUTATION_CHANCE = value; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData ASK_FOR_BAMBOO_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ASK_FOR_BAMBOO_TICKS); }
// public void ASK_FOR_BAMBOO_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.ASK_FOR_BAMBOO_TICKS = value.wrapperContained; }
// public java.util.function.Predicate IS_FOOD() { return wrapperContained.IS_FOOD; }
// public void IS_FOOD(java.util.function.Predicate value) { wrapperContained.IS_FOOD = value; }
// public yarnwrap.entity.data.TrackedData MAIN_GENE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.MAIN_GENE); }
// public void MAIN_GENE(yarnwrap.entity.data.TrackedData value) { wrapperContained.MAIN_GENE = value.wrapperContained; }
public int playingTicks() { return wrapperContained.playingTicks; }
public void playingTicks(int value) { wrapperContained.playingTicks = value; }
// public yarnwrap.entity.data.TrackedData PANDA_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PANDA_FLAGS); }
// public void PANDA_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.PANDA_FLAGS = value.wrapperContained; }
// public boolean shouldGetRevenge() { return wrapperContained.shouldGetRevenge; }
// public void shouldGetRevenge(boolean value) { wrapperContained.shouldGetRevenge = value; }
// public boolean shouldAttack() { return wrapperContained.shouldAttack; }
// public void shouldAttack(boolean value) { wrapperContained.shouldAttack = value; }
// public yarnwrap.entity.data.TrackedData SNEEZE_PROGRESS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SNEEZE_PROGRESS); }
// public void SNEEZE_PROGRESS(yarnwrap.entity.data.TrackedData value) { wrapperContained.SNEEZE_PROGRESS = value.wrapperContained; }
// public float rollOverAnimationProgress() { return wrapperContained.rollOverAnimationProgress; }
// public void rollOverAnimationProgress(float value) { wrapperContained.rollOverAnimationProgress = value; }
// public float lastRollOverAnimationProgress() { return wrapperContained.lastRollOverAnimationProgress; }
// public void lastRollOverAnimationProgress(float value) { wrapperContained.lastRollOverAnimationProgress = value; }
// public float lieOnBackAnimationProgress() { return wrapperContained.lieOnBackAnimationProgress; }
// public void lieOnBackAnimationProgress(float value) { wrapperContained.lieOnBackAnimationProgress = value; }
// public float lastLieOnBackAnimationProgress() { return wrapperContained.lastLieOnBackAnimationProgress; }
// public void lastLieOnBackAnimationProgress(float value) { wrapperContained.lastLieOnBackAnimationProgress = value; }
// public float sittingAnimationProgress() { return wrapperContained.sittingAnimationProgress; }
// public void sittingAnimationProgress(float value) { wrapperContained.sittingAnimationProgress = value; }
// public float lastSittingAnimationProgress() { return wrapperContained.lastSittingAnimationProgress; }
// public void lastSittingAnimationProgress(float value) { wrapperContained.lastSittingAnimationProgress = value; }
// public yarnwrap.entity.data.TrackedData EATING_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.EATING_TICKS); }
// public void EATING_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.EATING_TICKS = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData HIDDEN_GENE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.HIDDEN_GENE); }
// public void HIDDEN_GENE(yarnwrap.entity.data.TrackedData value) { wrapperContained.HIDDEN_GENE = value.wrapperContained; }
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