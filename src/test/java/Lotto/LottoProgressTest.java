package Lotto;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.*;

public class LottoProgressTest {

    private Amount amount;
    private int quantity;

    private LottoProgress lottoProgress;
    private LottoPaper lottoPaper;

    @BeforeEach
    public void setUp() {
        amount = new Amount("14000");

        lottoProgress = new LottoProgress();
        lottoPaper = new LottoPaper();

        quantity = lottoProgress.amountToQuantity(amount);
    }

    @Test
    public void amountToQuantity() {
        assertThat(lottoProgress.amountToQuantity(amount)).isEqualTo(14);
    }



}
