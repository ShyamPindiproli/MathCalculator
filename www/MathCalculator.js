var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'MathCalculator', 'coolMethod', [arg0]);
};

module.exports.add = function (arg0, success, error)
{
    exec(success, error, 'MathCalculator', 'add',[arg0])

}

module.exports.subtract = function (arg0, success, error)
{
    exec(success, error, 'MathCalculator', 'subtract',[arg0])

}

module.exports.multiply = function (arg0, success, error)
{
    exec(success, error, 'MathCalculator', 'multiply',[arg0])

}

module.exports.divide = function (arg0, success, error)
{
    exec(success, error, 'MathCalculator', 'divide',[arg0])

}