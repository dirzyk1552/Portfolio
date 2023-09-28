/*Creating constants for all of my buttons */
const display = document.querySelector('.display');
const digitButtons = document.querySelectorAll('.digit-button');
const operatorButtons = document.querySelectorAll('.operator-button');
const equalsButton = document.querySelector('.equal');
const clearButton = document.querySelector('.clear');
const memoryButton =document.querySelectorAll('.memory-button');

var currentAnswer = '';
/*Creating function to change the display*/
function changeDisplay() {
  display.textContent = currentAnswer;
}
/*Adding functions for addition, subtraction, division, and multiplication */
function changeExpression(expression) {
  const operators = {
    '-': (x, y) => x - y,
    '+': (x, y) => x + y,
    '/': (x, y) => x / y,
    '*': (x, y) => x * y,
  };
/* Creating constants for the operators*/
  const tokens = expression.split(/(\+|\-|\*|\/)/g);
  var result = parseFloat(tokens[0]);

  for (var a = 1; a < tokens.length; a += 2) {
    const operator = tokens[a];
    const operand = parseFloat(tokens[a+1]);
    result = operators[operator](result, operand);
  }

  return result.toString();
}
/*Adding event Listener that when user clicks =, it  */
equalsButton.addEventListener('click', () => {
  currentAnswer = changeExpression(currentAnswer);
  changeDisplay();
}
);
/* Adding Event listener for when user clicks a number*/
digitButtons.forEach(button => {
  button.addEventListener('click', () => {
    currentAnswer += button.textContent;
    changeDisplay();
  }
  );
}
);
/*Adding Event Listener that when user clicks button, it clears the display*/
clearButton.addEventListener('click', () => {
  currentAnswer = '';
  changeDisplay();
}
);
/* Adding Event Listener for when user clicks +, -, /, * */
operatorButtons.forEach(button => {
    button.addEventListener('click', () => {
      currentAnswer += button.textContent;
      changeDisplay();
    }
    );
  }
  );