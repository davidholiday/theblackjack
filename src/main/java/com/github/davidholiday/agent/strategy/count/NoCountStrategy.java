package com.github.davidholiday.agent.strategy.count;

import com.github.davidholiday.cardcollection.Hand;
import com.github.davidholiday.cardcollection.HandCollection;
import com.github.davidholiday.game.ActionToken;
import com.github.davidholiday.game.RuleSet;

public class NoCountStrategy extends CountStrategy {

    public static final String NAME = "NO_COUNT_STRATEGY";

    public NoCountStrategy(RuleSet ruleSet) {
        super(ruleSet);
    }

    @Override
    public void resetCount() {
        super.count = 0;
    }

    @Override
    public int getCount() { return super.count; }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void updateCount(ActionToken actionToken) { /* noop */ }

    @Override
    public double getWager(ActionToken actionToken) {
        lastAnteWager = 10;
        return 10;
    }

    @Override
    public double getInsuranceBet(Hand hand, ActionToken actionToken) { return 0; }

    @Override
    public double getLastAnteWager() { return lastAnteWager; }
}
