// Last updated: 7/4/2026, 2:45:13 PM
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let current = init;

     function increment(){
        current+=1;
        return current;
    }

     function decrement(){
        current-=1;
        return current;
    }

     function reset(){
        current = init;
        return current;
    }
    
    return{
        increment,decrement,reset
    };
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */