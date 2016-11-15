package ironyard;

public class Main {

    public static void main(String[] args) {

        Constitution C = new Constitution ();
            C.articles = (7);
            C.ammendments = (27);
            C.authors = "Alexander Hamilton, John Jay";
            C.states = (50);

       Senate S = new Senate ();
            S.numberSeats = (100);
            S.currentMajority = "Republican";
            S.majoritySeats = (54);
            S.pluralityVote = true;

       HouseofRepresentatives H = new HouseofRepresentatives();
            // House officers:
                H.officers [0] = "Chaplain";
                H.officers [1] = "CAO";
                H.officers [2] = "clerk";
                H.officers [3] = "Sergeant";
            // House officials:
                H.officials [0] = "General Counsel";
                H.officials [1] = "Historian";
                H.officials [2] = "General";
                H.officials [3] = "Parlimentarian";
            // House organizations:
                H.organizations [0] = "Congressional Ethics";
                H.organizations [1] = "Interparliamentary Affairs";
                H.organizations [2] = "Revision Council";
                H.organizations [3] = "Counsel";

       SupremeCourt T = new SupremeCourt();
            // Current Residing Supreme Court Members
                T.memberNames [0] = "Roberts";
                T.memberNames [1] = "Thomas";
                T.memberNames [2] = "Breyer";
                T.memberNames [3] = "Sotomayor";
                T.memberNames [4] = "Scalia";
                T.memberNames [5] = "Kennedy";
                T.memberNames [6] = "Ginsburg";
                T.memberNames [7] = "Alito";
                T.memberNames [8] = "Kagan";
            T.femaleJustices = (4);
            T.openSeats = true;
            T.novArguments = (8);

       President P = new President();
            P.cabinetSeats = (23);
            P.inagurationPending = true;
            P.presidentName = "Barack Hussein Obama";
                P.currentCouncils [0] = "Economic";
                P.currentCouncils [1] = "Environmental";
                P.currentCouncils [2] = "Administrative";
                P.currentCouncils [3] = "Drug";
                P.currentCouncils [4] = "Trade";
                P.currentCouncils [5]  = "VP";

       Elect E = new Elect();
            E.cheifStrat = "Reince Priebus";
            E.repChair = "Steve Bannon";
            E.inaugDate = (01.20);
            E.presElect = "Donald John Trump";

       Firstpresidency F = new Firstpresidency();
            F.absenTees = " John Adams";
            F.firstPres = "George Washington";
            F.firstCabMeeting = (2.1793);
                F.cabinetMembers [0] = "Thomas Jefferson";
                F.cabinetMembers [1] = "Alexander Hamilton";
                F.cabinetMembers [2] = "Henry Knox";
                F.cabinetMembers [3] = "Edmund Randolph";
    }
}
