import styled from "styled-components";
import Wrapper from "./Wrapper";
import Block from "./Block";


const Blocks = (props) => {
    // console.log(`Blocks = ${props}`);
    return (
        <Wrapper {...props} >
            {props.blockItems.map((blockItem) => {
                return (
                    <Block padding={blockItem.padding}
                            backgroundImage={blockItem.backgroundImage}
                    >
                        {blockItem.label}
                    </Block>
                );
            })}
        </Wrapper>
    )
}

export default Blocks;

