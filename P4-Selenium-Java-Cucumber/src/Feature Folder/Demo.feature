Feature: My feature1
  Feature Description:This Demo feature contains smoke and functional scenarios(scenario outline and step variable example)

  @outline
  Scenario Outline: login scenario - scenario 1
    Given Login to application using "<uname>" and "<pwd>"

    #two variables can be represented within  "<variable>" or "variable"
    Examples: 
      | uname   | pwd     |
      | mercury | mercury |
      
