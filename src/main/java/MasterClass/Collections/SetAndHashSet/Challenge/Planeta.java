package MasterClass.Collections.SetAndHashSet.Challenge;

import MasterClass.Collections.SetAndHashSet.NebesnoeTelo;

public class Planeta extends NebesnoeTelo {
    public Planeta(String nameOfObject, double orbitalnoeVremyVrasheniya) {
        super(nameOfObject, orbitalnoeVremyVrasheniya, TypeOfTel.PLANETA);
    }

    @Override
    public boolean addSputnik(NebesnoeTelo luna) {
        if (luna.getNestedKey().getTypeOfTel() == TypeOfTel.LUNA) {
            return super.addSputnik(luna);
        } else {
            return false;
        }
    }
}
