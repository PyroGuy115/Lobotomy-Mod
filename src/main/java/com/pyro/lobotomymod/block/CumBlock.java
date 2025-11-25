package com.pyro.lobotomymod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CumBlock extends Block {
    public CumBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof LivingEntity) {
            double slowFactor = 0.5;
            entity.setVelocity(
                    entity.getVelocity().x * slowFactor,
                    entity.getVelocity().y,
                    entity.getVelocity().z * slowFactor
            );
            entity.velocityModified = true;
        }
        super.onSteppedOn(world, pos, state, entity);
    }
}