package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.DuckDuckGoResult;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.DuckDuckGoHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see search result about {string}")
    public void should_see_search_result_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(DuckDuckGoResult.HEADING).hasText(term)
        );
    }

}
